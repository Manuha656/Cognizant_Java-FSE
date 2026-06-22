import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static Product ls(Product[] prod, int id) {
        for (Product p : prod) {
            if (p.productId == id)
                return p;
        }
        return null;
    }

    public static Product bs(Product[] prod, int id) {
        int l = 0, r = prod.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (prod[mid].productId == id)
                return prod[mid];
            else if (prod[mid].productId > id)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories"),
                new Product(102, "Phone", "Electronics"),
                new Product(104, "Bag", "Fashion")
        };
        Product p1 = ls(products, 101);
        System.out.println((p1 == null) ? "Not found" : p1);
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
        Product p2 = bs(products, 104);
        System.out.println((p1 == null) ? "Not found" : p2);
    }
}

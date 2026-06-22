import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Manu", 5, 100);
        Product p2 = new Product(2, "Sonu", 10, 200);
        ArrayList<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        for (Product p : list)
            System.out.println(p.productId + " " + p.productName + " " + p.quantity + " " + p.price);
    }
}

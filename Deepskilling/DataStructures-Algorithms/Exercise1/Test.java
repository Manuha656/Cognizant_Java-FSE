import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Product1 p1 = new Product1(1, "Manu", 5, 100);
        Product1 p2 = new Product1(2, "Sonu", 10, 200);
        ArrayList<Product1> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        for (Product1 p : list)
            System.out.println(p.productId + " " + p.productName + " " + p.quantity + " " + p.price);
    }
}

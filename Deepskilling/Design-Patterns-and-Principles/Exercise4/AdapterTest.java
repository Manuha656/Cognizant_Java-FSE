package Exercise4;

public class AdapterTest {
    public static void main(String[] args) {
        PaymentProcessor p = new PaymentAdapter();
        p.pay();
    }
}

package Exercise8;

public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext pc = new PaymentContext(new CreditCardPayment());
        pc.payment();
        pc = new PaymentContext(new PayPalPayment());
        pc.payment();
    }
}

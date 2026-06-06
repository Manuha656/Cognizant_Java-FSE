package Exercise8;

public class PaymentContext {
    PaymentStrategy p;

    public PaymentContext(PaymentStrategy p) {
        this.p = p;
    }

    public void payment() {
        p.pay();
    }
}

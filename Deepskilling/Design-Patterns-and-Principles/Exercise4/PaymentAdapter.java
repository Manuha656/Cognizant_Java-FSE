package Exercise4;

public class PaymentAdapter implements PaymentProcessor {
    RazorpayGateway razor;

    public PaymentAdapter() {
        razor = new RazorpayGateway();
    }

    public void pay() {
        razor.razorpay();
    }
}

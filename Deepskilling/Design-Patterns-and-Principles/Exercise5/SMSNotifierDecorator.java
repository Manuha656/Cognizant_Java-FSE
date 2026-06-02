package Exercise5;

public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier n) {
        super(n);
    }

    public void send() {
        n.send();
        System.out.println(" through SMS");
    }
}

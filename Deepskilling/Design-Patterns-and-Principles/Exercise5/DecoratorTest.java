package Exercise5;

public class DecoratorTest {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier = new SMSNotifierDecorator(notifier);
        notifier.send();
        notifier = new SlackNotifierDecorator(notifier);
        notifier.send();
    }
}

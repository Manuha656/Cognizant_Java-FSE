package Exercise5;

public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier n) {
        super(n);
    }

    public void send() {
        n.send();
        System.out.println(" through Slack");
    }
}

package Exercise5;

abstract class NotifierDecorator implements Notifier {
    protected Notifier n;

    NotifierDecorator(Notifier n) {
        this.n = n;
    }
}

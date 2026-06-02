package Exercise6;

public class ProxyTest {
    public static void main(String[] args) {
        Image img = new ProxyImage("img.jpg");
        img.display();
        img.display();
    }
}

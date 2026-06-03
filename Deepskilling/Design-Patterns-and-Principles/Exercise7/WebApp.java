public class WebApp implements User {
    private String name;

    WebApp(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("Web Stock update..");
    }
}

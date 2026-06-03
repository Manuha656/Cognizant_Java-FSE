public class MobileApp implements User {
    private String name;

    MobileApp(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("Mobile Stock update..");
    }
}

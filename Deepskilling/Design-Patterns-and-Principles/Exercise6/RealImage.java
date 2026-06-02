package Exercise6;

public class RealImage implements Image {
    String filename;

    public RealImage(String filename) {
        this.filename = filename;
        load();
    }

    public void load() {
        System.out.println("Loading Image...");
    }

    public void display() {
        System.out.println("Displaying img...");
    }
}
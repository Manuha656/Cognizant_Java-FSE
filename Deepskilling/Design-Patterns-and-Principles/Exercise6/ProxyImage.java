package Exercise6;

public class ProxyImage implements Image {
    RealImage realImg;
    public String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (realImg == null)
            realImg = new RealImage(filename);
        realImg.display();
    }
}

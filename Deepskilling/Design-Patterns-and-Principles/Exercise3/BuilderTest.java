public class BuilderTest {
    public static void main(String[] args) {
        Computer c = new Computer.Builder()
                .setCPU("CPU")
                .setRAM("8GB")
                .setStorage("100MB")
                .build();
        c.display();
    }
}

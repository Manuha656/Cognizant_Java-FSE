public class Computer {
    private String cpu;
    private String ram;
    private String storage;

    private Computer(Builder b) {
        this.cpu = b.cpu;
        this.ram = b.ram;
        this.storage = b.storage;
    }

    public void display() {
        System.out.println(cpu);
        System.out.println(ram);
        System.out.println(storage);
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
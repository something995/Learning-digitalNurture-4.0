public class BuilderPattern {
    static class Computer {
        String cpu, ram;
        Computer(String c, String r) { cpu = c; ram = r; }
        void show() { System.out.println("CPU: " + cpu + ", RAM: " + ram); }
    }
    static class ComputerBuilder {
        String cpu, ram;
        ComputerBuilder setCPU(String c) { cpu = c; return this; }
        ComputerBuilder setRAM(String r) { ram = r; return this; }
        Computer build() { return new Computer(cpu, ram); }
    }
    public static void main(String[] args) {
        Computer c = new ComputerBuilder().setCPU("i5").setRAM("8GB").build();
        c.show();
    }
}
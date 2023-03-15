package DesignPatterns.Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Factory f = new MsiManufacturer();
        GPU msi = f.createGpu();
        Monitor ms = f.createMonitor();
        msi.assemble();

    }
}

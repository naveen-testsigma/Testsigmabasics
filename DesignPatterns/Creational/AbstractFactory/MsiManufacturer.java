package DesignPatterns.Creational.AbstractFactory;

public class MsiManufacturer extends Factory{

    @Override
    public GPU createGpu() {
        System.out.println("Msi GPU Creating ");
        return new MsiGPU();
    }

    @Override
    public Monitor createMonitor() {
        System.out.println("Msi Monitor Created");
        return new MsiMonitor();
    }
}

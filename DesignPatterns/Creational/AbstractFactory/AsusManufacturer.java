package DesignPatterns.Creational.AbstractFactory;

public class AsusManufacturer extends Factory{

    @Override
    public GPU createGpu() {
        return new AsusGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}

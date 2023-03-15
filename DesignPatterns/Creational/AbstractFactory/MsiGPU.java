package DesignPatterns.Creational.AbstractFactory;

class MsiGPU implements GPU{

    @Override
    public void assemble() {
        System.out.println("Assembled MSI GPU!");
    }
}

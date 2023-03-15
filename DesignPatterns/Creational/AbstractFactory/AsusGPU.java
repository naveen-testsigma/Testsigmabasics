package DesignPatterns.Creational.AbstractFactory;

public class AsusGPU implements GPU{

    @Override
    public void assemble() {
        System.out.println("Assembled ASUS GPU");
    }
}

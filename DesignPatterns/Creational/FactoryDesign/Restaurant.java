package DesignPatterns.Creational.FactoryDesign;


public abstract class Restaurant{
    public void orderBurger(){
        System.out.println("Ordering Burger...");
        Burger b = createBurger();
        b.prepare();
    }
    public abstract Burger createBurger();
}


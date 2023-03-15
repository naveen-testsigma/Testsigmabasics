package DesignPatterns.Structural.Decorator;

public class Mozzarella extends ToppingDecorator{
    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding MOZ");
    }
    public String getDes() {
        return tempPizza.getDes()+"Mozzarella";
    }
}

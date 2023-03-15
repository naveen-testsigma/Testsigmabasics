package DesignPatterns.Structural.Decorator;

public class TomatoSauce extends ToppingDecorator{
    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Tomato Sauce");
    }
    public String getDes() {
        return tempPizza.getDes()+"Tomato Sauce";
    }
}
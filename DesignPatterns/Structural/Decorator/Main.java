package DesignPatterns.Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza=new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println(pizza.getDes());
    }
}
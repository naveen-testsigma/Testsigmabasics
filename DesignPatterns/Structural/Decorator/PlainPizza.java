package DesignPatterns.Structural.Decorator;

public class PlainPizza implements Pizza{
    @Override
    public String getDes() {
        return "Thin Dough";
    }
}

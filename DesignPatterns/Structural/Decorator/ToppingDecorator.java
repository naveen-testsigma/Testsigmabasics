package DesignPatterns.Structural.Decorator;

abstract class ToppingDecorator implements Pizza{
    Pizza tempPizza;

    public ToppingDecorator(Pizza tempPizza) {
        this.tempPizza = tempPizza;
    }

    @Override
    public String getDes() {
        return tempPizza.getDes();
    }
}

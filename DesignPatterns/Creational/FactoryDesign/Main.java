package DesignPatterns.Creational.FactoryDesign;

public class Main {
    public static void main(String[] args) {
        Restaurant r = new VeggieBurgerRestaurant();
        r.orderBurger();
        Restaurant r2 = new ChickenBurgerRestaurant();
        r2.orderBurger();
    }

}

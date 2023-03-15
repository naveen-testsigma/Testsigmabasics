package DesignPatterns.Creational.FactoryDesign;

public class ChickenBurgerRestaurant extends Restaurant{

    @Override
    public Burger createBurger() {
        System.out.println("Creating Chicken Burger");
        return new ChickenBurger();
    }
}


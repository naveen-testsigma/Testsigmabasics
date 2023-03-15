package DesignPatterns.Creational.Builder;

public class Director {
    public void buildBugatti(CarBuilder builder){
        builder.name("Bugatti").color("Yellow").id(12);
    }
    public void buildChervolet(CarBuilder builder){
        builder.name("Chlet");
        builder.color("Yelervolow");
        builder.id(10);
    }
}

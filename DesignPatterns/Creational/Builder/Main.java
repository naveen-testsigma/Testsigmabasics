package DesignPatterns.Creational.Builder;

public class Main {
    public static void main(String[] args) {
        Director d = new Director();
        CarBuilder c = new CarBuilder();
        d.buildBugatti(c);
        Car car = c.build();
    }

}
/*

 */
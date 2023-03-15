package DesignPatterns.Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonTest obj = SingletonTest.getInstance("Hello");
        obj.getDetails();
    }
}

package DesignPatterns.Creational.Prototype;public class Main {
    public static void main(String[] args) {
       Car c = new Car(12,"Chervolet");
       Car b = c;
       b.display();
    }
}

package DesignPatterns.Creational.Prototype;

public class Car implements Prototype {
    private int id;
    private String name;
    Car(int id,String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    Car(Car c){
        this.id = c.id;
        this.name = c.name;
    }
    public Car clone(){
        return new Car(this);
    }
}

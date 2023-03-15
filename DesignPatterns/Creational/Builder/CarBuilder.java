package DesignPatterns.Creational.Builder;

public class CarBuilder {
    private String name;
    private String color;
    private int id;
    public CarBuilder id(int id){
        this.id = id;
        return this;
    }
    public CarBuilder name(String name){
        this.name = name;
        return this;
    }
    public CarBuilder color(String color){
        this.color = color;
        return this;
    }
    public Car build(){
        return new Car(id,color,name);
    }
}

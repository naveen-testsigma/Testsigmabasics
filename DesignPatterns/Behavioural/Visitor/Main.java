package DesignPatterns.Behavioural.Visitor;

public class Main {
    public static void main(String[] args)
    {
        ComputerParts keyboard=new Keyboard();
        keyboard.accept(new ComputerPartsVisitor());
    }
}
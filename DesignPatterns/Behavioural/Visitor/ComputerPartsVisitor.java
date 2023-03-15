package DesignPatterns.Behavioural.Visitor;

public class ComputerPartsVisitor {
    void getDetails(Keyboard keyboard)
    {
        System.out.println("This is keyboard");
    }
    void getDetails(Mouse mouse)
    {
        System.out.println("This is mouse");
    }
    void getDetails(Speaker speaker)
    {
        System.out.println("This is spreaker");
    }
}

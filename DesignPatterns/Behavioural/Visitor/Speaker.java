package DesignPatterns.Behavioural.Visitor;

public class Speaker implements ComputerParts{
    @Override
    public void accept(ComputerPartsVisitor computer) {
        computer.getDetails(this);
    }
}

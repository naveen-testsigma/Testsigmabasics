package DesignPatterns.Behavioural.Visitor;

public class Mouse implements ComputerParts{
    @Override
    public void accept(ComputerPartsVisitor computer) {
        computer.getDetails(this);
    }
}

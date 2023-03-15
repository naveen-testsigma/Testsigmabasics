package DesignPatterns.Behavioural.Visitor;

public interface ComputerParts {
    void accept(ComputerPartsVisitor computer);
}

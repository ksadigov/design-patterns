package designPatterns.behavioral.visitor;

/**
 * Defines a new operation to a class without change.
 * Example: Operation of a taxi company.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}

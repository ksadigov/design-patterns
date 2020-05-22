package designPatterns.creational.prototype;

public class Square extends Shape {

    public Square() {
        setType("Square");
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

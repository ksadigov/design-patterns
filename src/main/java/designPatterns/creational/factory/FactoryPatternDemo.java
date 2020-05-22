package designPatterns.creational.factory;

/**
 * In Factory pattern, we create object without exposing the creation logic to the client and
 * refer to newly created object using a common interface.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape triangle = shapeFactory.getShape("triangle");
        triangle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

    }
}

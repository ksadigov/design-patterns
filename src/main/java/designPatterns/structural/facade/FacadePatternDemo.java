package designPatterns.structural.facade;

/**
 * Facade pattern: A single class that represents an entire subsystem.
 * Advantage --> reduce network calls,
 * helps in establishing transaction boundary,
 * reduce coupling.
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}

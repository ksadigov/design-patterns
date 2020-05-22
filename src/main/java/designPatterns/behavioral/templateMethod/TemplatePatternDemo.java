package designPatterns.behavioral.templateMethod;

/**
 * Defer the exact steps of an algorithm to a subclass.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}

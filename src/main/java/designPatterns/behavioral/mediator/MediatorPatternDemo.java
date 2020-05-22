package designPatterns.behavioral.mediator;

/**
 * Defines simplified communication between classes.
 * Example: Air traffic controller(imagine all flights talking each other to decide route and landing).
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}

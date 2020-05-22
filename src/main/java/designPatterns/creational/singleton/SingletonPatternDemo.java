package designPatterns.creational.singleton;

/**
 * A class of which only a single instance can exist.
 * Example: java.lang.System
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {

        SingleObject instance = new SingleObject();

        SingleObject instance1 = SingleObject.getInstance();

        instance.showMessage();
    }
}

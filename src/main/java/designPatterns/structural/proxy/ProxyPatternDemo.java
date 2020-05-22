package designPatterns.structural.proxy;

/**
 * An object representing another object.
 * This type of design pattern comes under structural pattern.
 * Example: Credit card is a proxy for what is in our bank account.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("image.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }

}

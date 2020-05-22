package designPatterns.structural.decorator;

/**
 * Add responsibilities to objects dynamically.
 * Example: Java I/O.
 * Disadvantage: Complexity in creating objects.
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();

        System.out.println("\n*****");

        Car car = new LuxuryCar(new ElectricCar(new SportsCar(new BasicCar())));
        car.assemble();
    }
}

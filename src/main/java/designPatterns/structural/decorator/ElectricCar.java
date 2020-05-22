package designPatterns.structural.decorator;

public class ElectricCar extends CarDecorator {

    public ElectricCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding features of Electric Car.");
    }
}

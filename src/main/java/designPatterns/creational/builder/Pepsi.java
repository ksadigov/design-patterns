package designPatterns.creational.builder;

public class Pepsi extends ColdDrink {

    @Override
    public Float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
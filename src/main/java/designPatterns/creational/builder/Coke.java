package designPatterns.creational.builder;

public class Coke extends ColdDrink {

    @Override
    public Float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
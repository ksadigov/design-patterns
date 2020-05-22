package designPatterns.creational.builder;

public class VegBurger extends Burger {

    @Override
    public Float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
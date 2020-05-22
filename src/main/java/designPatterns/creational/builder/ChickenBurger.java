package designPatterns.creational.builder;

public class ChickenBurger extends Burger {

    @Override
    public Float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
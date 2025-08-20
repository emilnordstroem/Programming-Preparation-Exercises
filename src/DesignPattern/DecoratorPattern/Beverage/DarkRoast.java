package DesignPattern.DecoratorPattern.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
    }

    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double cost() {
        return 10;
    }

}

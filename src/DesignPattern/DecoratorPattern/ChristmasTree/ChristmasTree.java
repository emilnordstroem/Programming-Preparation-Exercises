package DesignPattern.DecoratorPattern.ChristmasTree;

public class ChristmasTree extends Tree {

    public ChristmasTree() {}

    @Override
    public String getDescription() {
        return "Christmas Tree";
    }

    @Override
    public double cost() {
        return 40;
    }

}

package DesignPattern.DecoratorPattern.ChristmasTree.Decorator;

import DesignPattern.DecoratorPattern.ChristmasTree.Tree;

public class Ordiment extends TreeDecorator {
    private final Tree tree;

    public Ordiment(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String getDescription() {
        return tree.getDescription() + ", Ordiment";
    }

    @Override
    public double cost() {
        return tree.cost() + 2.99;
    }
}

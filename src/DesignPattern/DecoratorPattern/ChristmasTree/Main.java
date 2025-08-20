package DesignPattern.DecoratorPattern.ChristmasTree;

import DesignPattern.DecoratorPattern.ChristmasTree.Decorator.Ordiment;

public class Main {

    public static void main(String[] args) {

        Tree christmasTree = new ChristmasTree();
        christmasTree = new Ordiment(christmasTree);
        System.out.println(christmasTree.getDescription());
        System.out.println(christmasTree.cost());
        christmasTree = new Ordiment(christmasTree);
        System.out.println(christmasTree.getDescription());
        System.out.println(christmasTree.cost());

    }

}

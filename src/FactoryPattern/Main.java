package FactoryPattern;

import FactoryPattern.coffeFactoryPattern.AmericanCoffeeShop;
import FactoryPattern.coffeFactoryPattern.CoffeeShop;
import FactoryPattern.coffeFactoryPattern.CoffeeType;
import FactoryPattern.userFactoryPattern.AdminFactory;
import FactoryPattern.userFactoryPattern.CustomerFactory;
import FactoryPattern.userFactoryPattern.User;
import FactoryPattern.userFactoryPattern.UserFactory;

public class Main {

    public static void main(String[] args) {
        CoffeeShop starbucks = new AmericanCoffeeShop();
        starbucks.newOrder(CoffeeType.ESPRESSO);

        UserFactory adminFactory = new AdminFactory();
        UserFactory customerFactory = new CustomerFactory();

        User adminUser = adminFactory.createUser();
        User customerUser = customerFactory.createUser();

        adminUser.isAuthorized();
        customerUser.isAuthorized();

    }

}
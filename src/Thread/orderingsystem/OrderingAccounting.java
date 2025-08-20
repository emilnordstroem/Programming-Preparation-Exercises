package Thread.orderingsystem;

import java.util.concurrent.Semaphore;

public class OrderingAccounting {
    private final Semaphore waiterSemaphore = new Semaphore(1);
    private final Semaphore CheifSemaphore = new Semaphore(0);
    private int placedOrders = 0;
    private int completedOrders = 0;

    public OrderingAccounting() {}

    public void orderPlaced(){
        placedOrders++;
        System.out.printf("An order has been placed%nTotal placed orders: %d%n",
                placedOrders
        );
    }

    public void orderCompleted(){
        if (placedOrders > 0) {
            completedOrders++;
            System.out.printf("An order has been finished%nTotal completed orders: %d%n",
                    completedOrders
            );
        } else {
            System.out.println("No Order has been placed");
        }
    }

    public Semaphore getWaiterSemaphore() {
        return waiterSemaphore;
    }

    public Semaphore getCheifSemaphore() {
        return CheifSemaphore;
    }

}
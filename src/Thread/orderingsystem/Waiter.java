package Thread.orderingsystem;

import java.util.Random;

public class Waiter extends Thread {
    private final OrderingAccounting accounting;
    private final String identification;
    private final int orderPlacementLimit;

    public Waiter(OrderingAccounting accounting, String identification, int orderPlacementLimit) {
        this.accounting = accounting;
        this.identification = identification;
        this.orderPlacementLimit = orderPlacementLimit;
    }

    @Override
    public void run() {
        for (int orderCounter = 0; orderCounter < orderPlacementLimit; orderCounter++) {
            try {
                accounting.getWaiterSemaphore().acquire();
                placeAnOrder();
                accounting.getCheifSemaphore().release();
                accounting.getWaiterSemaphore().release();
                sleep(new Random().nextInt(500, 1500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void placeAnOrder(){
        System.out.printf("=====%s has placed an order=====%n",
                identification
        );
        accounting.orderPlaced();
    }

}

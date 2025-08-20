package Thread.orderingsystem;

import java.util.Random;

public class Chief extends Thread {
    private final OrderingAccounting accounting;
    private final String identification;
    private final int servingsLimit;

    public Chief(OrderingAccounting accounting, String identification, int servingsLimit) {
        this.accounting = accounting;
        this.identification = identification;
        this.servingsLimit = servingsLimit;
    }

    @Override
    public void run() {
        for (int orderCounter = 0; orderCounter < servingsLimit; orderCounter++) {
            try {
                accounting.getCheifSemaphore().acquire();
                finishAnOrder();
                sleep(new Random().nextInt(3000, 5000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        accounting.getCheifSemaphore().release();
    }

    public void finishAnOrder(){
        System.out.printf("=====%s tries to finish an order=====%n",
                identification
        );
        accounting.orderCompleted();
    }

}

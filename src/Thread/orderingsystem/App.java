package Thread.orderingsystem;

public class App {

    public static void main(String[] args) {
        OrderingAccounting accounting = new OrderingAccounting();
        int chiefLimit = 10;
        Chief nicolaj = new Chief(accounting, "Nicolaj", chiefLimit);
        int waiterLimit = 5;
        Waiter emil = new Waiter(accounting, "Emil", waiterLimit);
        Waiter simon = new Waiter(accounting, "Simon", waiterLimit);

        nicolaj.start();
        emil.start();
        simon.start();

        try {
            emil.join();
            simon.join();
            nicolaj.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("=====App completed=====");
        }

    }
}

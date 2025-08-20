package ObserverDesignPattern.subject;

public class User implements Observer {
    private final int identification;

    public User(int identification) {
        this.identification = identification;
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}

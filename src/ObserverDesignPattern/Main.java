package ObserverDesignPattern;

import ObserverDesignPattern.observer.PushNotification;
import ObserverDesignPattern.subject.User;

public class Main {

    public static void main(String[] args) {
        PushNotification notification = new PushNotification();
        for (int userCounter = 1; userCounter <= 5; userCounter++) {
            notification.registerObserver(new User(userCounter));
        }
        notification.setMessage("Sale on T-Shirts");
        notification.updateObservers();
        notification.setMessage("Sale on Tank Tops");
        notification.updateObservers();
    }

}

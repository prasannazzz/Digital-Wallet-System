package notification;

public class EmailNotification implements Observer {

    @Override
    public void update(String message) {
        System.out.println("EMAIL: " + message);
    }
}


interface Notification {
    void sendMessage();
}

class EmailNotification implements Notification {
    public void sendMessage() {
        System.out.println("Sending Email Notification");
    }
}

// SMS Notification
class SMSNotification implements Notification {
    public void sendMessage() {
        System.out.println("Sending SMS Notification");
    }
}

// Push Notification
class PushNotification implements Notification {
    public void sendMessage() {
        System.out.println("Sending Push Notification");
    }
}

// Abstract Factory
abstract class NotificationFactory {
    abstract Notification createNotification();
}
class EmailFactory extends NotificationFactory {
    Notification createNotification() {
        return new EmailNotification();
    }
}


class SMSFactory extends NotificationFactory {
    Notification createNotification() {
        return new SMSNotification();
    }
}

// Push Factory
class PushFactory extends NotificationFactory {
    Notification createNotification() {
        return new PushNotification();
    }
}

// Main Class
public class FactoryMethodDemo {

    public static void main(String[] args) {

        NotificationFactory emailFactory = new EmailFactory();
        Notification email = emailFactory.createNotification();
        email.sendMessage();

        NotificationFactory smsFactory = new SMSFactory();
        Notification sms = smsFactory.createNotification();
        sms.sendMessage();

        NotificationFactory pushFactory = new PushFactory();
        Notification push = pushFactory.createNotification();
        push.sendMessage();
    }
}
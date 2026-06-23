
interface MessageSender {
    void sendMessage(String message);
}

class EmailSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

class NotificationService {
    private MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void alertUser(String msg) {
        messageSender.sendMessage(msg);
    }
}

class SMSSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new NotificationService(new EmailSender());
        emailService.alertUser("Hello via Email");

        NotificationService smsService = new NotificationService(new SMSSender());
        smsService.alertUser("Hello via SMS");
    }
}

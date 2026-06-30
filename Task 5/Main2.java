
public class Main2 {

    interface MessageSender {
        void sendMessage(String message);
    }

    static class EmailSender implements MessageSender {
        @Override
        public void sendMessage(String message) {
            System.out.println("Sending email: " + message);
        }
    }

    static class NotificationService {
        private MessageSender messageSender;

        public NotificationService(MessageSender messageSender) {
            this.messageSender = messageSender;
        }

        public void alertUser(String msg) {
            messageSender.sendMessage(msg);
        }
    }

    public static void main(String[] args) {
        MessageSender sender = new EmailSender();
        NotificationService notificationService = new NotificationService(sender);
        notificationService.alertUser("Welcome to the system!");
    }
}

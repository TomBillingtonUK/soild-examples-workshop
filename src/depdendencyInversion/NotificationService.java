package depdendencyInversion;

enum NotificationType {
    EMAIL,
    LETTER
}

public class NotificationService {
    private EmailSender emailSender;
    private LetterSender letterSender;

    public NotificationService() {
        emailSender = new EmailSender();
        letterSender = new LetterSender();
    }

    public void sendNotification(String recipient, String message, NotificationType type) {
        if(type == NotificationType.EMAIL) {
            emailSender.sendEmail(recipient, message);
        } else if (type == NotificationType.LETTER) {
            letterSender.sendLetter(recipient, message);
        }
    }
}

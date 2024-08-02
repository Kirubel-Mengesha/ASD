package bank.integration;

public class EmailSender implements IEmailSender {
    private static EmailSender emailSenderInstance = new EmailSender();

    private EmailSender() {

    }

    public static EmailSender getEmailSenderInstance() {
        if (emailSenderInstance == null) {
            synchronized (EmailSender.class) {
                if (emailSenderInstance == null)
                    emailSenderInstance = new EmailSender();
            }
        }
        return emailSenderInstance;
    }

    public void sendEmail(String message) {
        System.out.println("Email sent: " + message);
    }

    public EmailSender getEmailSender() {
        return emailSenderInstance;
    }
}



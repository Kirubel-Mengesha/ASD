package bank.integration;

public class EmailSender implements IEmailSender {

    public void sendEmail(String message) {
        System.out.println("Email sent: " + message);
    }

}

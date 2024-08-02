package bank.integration;

public class MockEmailSender implements IEmailSender {
    public void sendEmail(String message) {
        System.out.println("Mock email sent: " + message);
    }
}

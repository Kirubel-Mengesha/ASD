package customers.Domain;

public class CustomerEvent {
    private String message;

    public CustomerEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

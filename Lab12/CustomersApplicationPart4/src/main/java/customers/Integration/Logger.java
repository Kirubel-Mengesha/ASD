package customers.Integration;

import org.springframework.stereotype.Component;

@Component
public class Logger {
    public void log(String message) {
        System.out.println("Logging: " + message);
    }
}

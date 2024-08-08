package customers.Service;

import customers.integration.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    private final Logger logger;

    public Scheduling(Logger logger) {
        this.logger = logger;
    }

    @Scheduled(fixedRate = 15000)
    public void logTime() {
       logger.log("Current time is: " + System.currentTimeMillis());
    }


}

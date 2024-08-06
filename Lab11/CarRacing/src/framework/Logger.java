package framework;

public class Logger implements Observer {
    @Override
    public void update(int speed) {
        System.out.println("Logger: Car speed is "+speed);
    }
}

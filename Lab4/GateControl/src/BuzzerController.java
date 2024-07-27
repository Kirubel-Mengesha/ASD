import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BuzzerController implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        GateState newState = (GateState) evt.getNewValue();
        switch (newState) {
            case OPENING:
            case CLOSING:
                System.out.println("Buzzer: ON");
                break;
            case OPEN:
            case CLOSED:
                System.out.println("Buzzer: OFF");
                break;
        }
    }
}

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class LightController implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        GateState newState = (GateState) evt.getNewValue();
        switch (newState) {
            case OPENING:
                System.out.println("Light: ORANGE FLASHING");
                break;
            case CLOSING:
                System.out.println("Light: RED FLASHING");
                break;
            case OPEN:
            case CLOSED:
                System.out.println("Light: OFF");
                break;
        }
    }
}

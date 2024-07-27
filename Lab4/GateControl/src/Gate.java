import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Gate {
    private GateState state;
    private PropertyChangeSupport support;

    public Gate() {
        state = GateState.CLOSED;
        support = new PropertyChangeSupport(this);
    }

    public void open() {
        setState(GateState.OPENING);
    }

    public void close() {
        setState(GateState.CLOSING);
    }

    public void stop() {
        // No specific action needed for stop in this simple example
    }

    public void setState(GateState newState) {
        GateState oldState = this.state;
        this.state = newState;
        support.firePropertyChange("state", oldState, newState);
    }

    public GateState getState() {
        return state;
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }
}

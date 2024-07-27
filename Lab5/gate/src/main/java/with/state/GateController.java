package with.state;

public class GateController {
    private Gate gate;
    private BuzzerController buzzerController;
    private GateState state;

    public GateController() {
        this.state = new ClosedState();
    }

    public void pressButton() {
        state.pressButton(this);
    }

    public void sensorOpenSignal() {
        state.sensorOpenSignal(this);
    }

    public void sensorCloseSignal() {
        state.sensorCloseSignal(this);
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public void setBuzzerController(BuzzerController buzzerController) {
        this.buzzerController = buzzerController;
    }

    public Gate getGate() {
        return gate;
    }

    public BuzzerController getBuzzerController() {
        return buzzerController;
    }

    public void setState(GateState state) {
        this.state = state;
    }
}

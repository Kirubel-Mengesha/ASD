package with.state;

public interface GateState {
    void pressButton(GateController gateController);
    void sensorOpenSignal(GateController gateController);
    void sensorCloseSignal(GateController gateController);
}

public class GateController {
    private Gate gate;

    public GateController(Gate gate) {
        this.gate = gate;
    }

    public void pressButton() {
        switch (gate.getState()) {
            case OPEN:
                gate.close();
                break;
            case CLOSED:
                gate.open();
                break;
            case OPENING:
                gate.close();
                break;
            case CLOSING:
                gate.open();
                break;
        }
    }

    public void sensorOpenSignal() {
        gate.setState(GateState.OPEN);
    }

    public void sensorClosedSignal() {
        gate.setState(GateState.CLOSED);
    }
}

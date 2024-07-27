package with.state;

public class OpeningState implements GateState {
    @Override
    public void pressButton(GateController gateController) {
        gateController.getGate().stop();
        gateController.getBuzzerController().stop();
        gateController.setState(new StoppedState(this));
    }

    @Override
    public void sensorOpenSignal(GateController gateController) {
        gateController.getGate().stop();
        gateController.getBuzzerController().stop();
        gateController.setState(new OpenState());
    }

    @Override
    public void sensorCloseSignal(GateController gateController) {
        System.out.println("This is not possible");
    }
}

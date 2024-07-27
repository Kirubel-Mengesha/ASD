package with.state;

public class ClosedState implements GateState {
    @Override
    public void pressButton(GateController gateController) {
        gateController.getGate().open();
        gateController.getBuzzerController().start();
        gateController.setState(new OpeningState());
    }

    @Override
    public void sensorOpenSignal(GateController gateController) {
        System.out.println("This is not possible");
    }

    @Override
    public void sensorCloseSignal(GateController gateController) {
        System.out.println("This is not possible");
    }
}

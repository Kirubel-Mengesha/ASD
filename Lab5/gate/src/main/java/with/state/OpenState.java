package with.state;

public class OpenState implements GateState {
    @Override
    public void pressButton(GateController gateController) {
        gateController.getGate().close();
        gateController.getBuzzerController().start();
        gateController.setState(new ClosingState());
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

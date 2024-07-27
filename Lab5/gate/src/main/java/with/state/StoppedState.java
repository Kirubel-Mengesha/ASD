package with.state;

public class StoppedState implements GateState {
    private GateState previousState;

    public StoppedState(GateState previousState) {
        this.previousState = previousState;
    }

    @Override
    public void pressButton(GateController gateController) {
        if (previousState instanceof OpeningState) {
            gateController.getGate().open();
            gateController.getBuzzerController().start();
            gateController.setState(new OpeningState());
        } else if (previousState instanceof ClosingState) {
            gateController.getGate().close();
            gateController.getBuzzerController().start();
            gateController.setState(new ClosingState());
        }
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

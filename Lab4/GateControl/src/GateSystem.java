public class GateSystem {
    public static void main(String[] args) {
        Gate gate = new Gate();
        GateController controller = new GateController(gate);
        BuzzerController buzzer = new BuzzerController();
        LightController light = new LightController();

        gate.addPropertyChangeListener(buzzer);
        gate.addPropertyChangeListener(light);

        Remote remote = new Remote(controller);
        Sensor sensor = new Sensor(controller);

        // Simulate button presses and sensor signals
        remote.pressButton(); // Opening gate
        sensor.sensorOpenSignal(); // Gate is open
        remote.pressButton(); // Closing gate
        sensor.sensorClosedSignal(); // Gate is closed
    }
}
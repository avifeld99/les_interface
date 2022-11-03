package be.intecbrussel;

public class Car {
    // properties
    private Switch onOffSwitch;
    private Motor motor;
    private Horn horn;

    public Car(Switch onOffSwitch, Motor motor, Horn horn) {
        this.onOffSwitch = onOffSwitch;
        this.motor = motor;
        this.horn = horn;
    }

    // getters and setters
    public Switch getOnOffSwitch() {
        return onOffSwitch;
    }

    public Motor getMotor() {
        return motor;
    }

    public Horn getHorn() {
        return horn;
    }
}

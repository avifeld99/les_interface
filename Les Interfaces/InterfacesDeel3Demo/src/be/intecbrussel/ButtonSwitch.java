package be.intecbrussel;

public class ButtonSwitch implements Switch{
    @Override
    public void turnOn() {
        System.out.println("Button is pressed -> ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Button is pressed again -> OFF");
    }
}

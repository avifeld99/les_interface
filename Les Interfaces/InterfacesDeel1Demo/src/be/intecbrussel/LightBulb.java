package be.intecbrussel;

public class LightBulb implements Switch{

    @Override
    public void turnOn() {
        System.out.println("Light is turned On!");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned Off!");
    }
}

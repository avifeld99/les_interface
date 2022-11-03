package be.intecbrussel;

public class KeySwitch implements Switch{
    @Override
    public void turnOn() {
        System.out.println("Key is turned over");
    }

    @Override
    public void turnOff() {
        System.out.println("Key is turned back");
    }
}

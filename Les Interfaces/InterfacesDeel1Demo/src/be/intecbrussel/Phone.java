package be.intecbrussel;

public class Phone implements Switch{
    @Override
    public void turnOn() {
        System.out.println("Phone is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("phone is turned off");
    }
}

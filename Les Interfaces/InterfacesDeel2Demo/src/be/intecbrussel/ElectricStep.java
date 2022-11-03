package be.intecbrussel;

public class ElectricStep implements Switch, Motor, Horn{
    @Override
    public void makeSound() {
        Horn.super.makeSound();
    }

    @Override
    public void accelerate() {
        System.out.println("Motor is speeding up");
    }

    @Override
    public void decelerate() {
        System.out.println("Motor is not giving assistance ... slowing down");
    }

    @Override
    public void turnOn() {
        System.out.println("E-step is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("E-step turned off");
    }
}

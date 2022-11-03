package be.intecbrussel;

public class Car implements Motor, Switch, Horn{

    public Car() {
    }

    // methods
    @Override
    public void makeSound() {
        System.out.println("honk honk");
        //Horn.super.makeSound();
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating!");
    }

    @Override
    public void decelerate() {
        System.out.println("Car is decelerating!");
    }

    @Override
    public void turnOn() {
        System.out.println("Motor is turned ON!");
    }

    @Override
    public void turnOff() {
        System.out.println("Motor is turned OFF!");
    }
}

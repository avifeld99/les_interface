package be.intecbrussel;

public class Step implements AnalogVehicle, Horn{
    @Override
    public void accelerate() {
        System.out.println("Kicking");
    }

    @Override
    public void decelerate() {
        System.out.println("Stop kicking");
    }

    @Override
    public void makeSound() {
        System.out.println("ping ping");
    }
}

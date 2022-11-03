package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.makeSound();
        car1.turnOn();
        car1.accelerate();

        Mower mower = new Mower();
        mower.turnOn();
        mower.accelerate();
        mower.decelerate();
        mower.turnOff();

        mower.adjustHeight(10);

        // Opdracht:
        // Maak een class "Step" en een class "ElectricStep"
        // Denk na over de nodige interfaces, of maak extra interfaces aan.

    }
}

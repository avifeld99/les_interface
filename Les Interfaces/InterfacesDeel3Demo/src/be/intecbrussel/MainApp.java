package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {

        Horn smallHorn = new SmallHorn();
        Horn bigHorn = new BigHorn();

        //SmallHorn smlHorn = new BigHorn();

        Switch keySwitch = new KeySwitch();
        Switch buttonSwitch = new ButtonSwitch();

        Motor petrolMotor = new PetrolMotor();
        Motor electroMotor = new ElectroMotor();

        Car oldCar = new Car(keySwitch, petrolMotor, smallHorn);
        Car electricCar = new Car(buttonSwitch, electroMotor, bigHorn);

        oldCar.getOnOffSwitch().turnOn();
        electricCar.getOnOffSwitch().turnOn();

        Horn bigHorn2 = new BigHorn();
        Car car3 = new Car(new ButtonSwitch(), new PetrolMotor(), bigHorn2);
        car3.getOnOffSwitch().turnOn();
        car3.getHorn().makeSound();
    }
}

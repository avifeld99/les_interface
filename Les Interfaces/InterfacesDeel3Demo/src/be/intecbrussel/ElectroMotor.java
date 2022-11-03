package be.intecbrussel;

public class ElectroMotor implements Motor{
    @Override
    public void accelerate() {
        System.out.println(" .... No sound, speeding up");
    }

    @Override
    public void decelerate() {
        System.out.println(".... No sound, slowing down");
    }
}

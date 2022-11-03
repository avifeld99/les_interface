package be.intecbrussel;

public class PetrolMotor implements Motor{
    @Override
    public void accelerate() {
        System.out.println("Rumbling sound, speeding up");
    }

    @Override
    public void decelerate() {
        System.out.println("Less Rumbling sound, slowing down");
    }
}

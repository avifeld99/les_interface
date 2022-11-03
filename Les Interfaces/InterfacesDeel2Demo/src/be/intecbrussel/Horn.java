package be.intecbrussel;

public interface Horn {
    default void makeSound(){
        System.out.println("Tuut tuut");
    }
}

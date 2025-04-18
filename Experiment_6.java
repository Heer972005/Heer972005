abstract class Animal {
    void breathe() {
        System.out.println("Animals breathe oxygen.");
    }
    abstract void makeSound();
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks");
    }
}
public class Experiment_6{
    public static void main(String[] args) {
        Dog myDog=new Dog();
        myDog.breathe();      // Calls non-abstract method
        myDog.makeSound();    // Calls overridden abstract method
    }
}

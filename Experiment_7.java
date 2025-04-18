class Animal {
    void sound() {
        System.out.println("Animals make sounds 🐾");
    }
}

// Multilevel Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks ");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps ");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Experiment_7 {
    public static void main(String[] args) {
        System.out.println("Single + Multilevel Inheritance:");
        Puppy p=new Puppy();
        p.sound();
        p.bark();
        p.weep();

        System.out.println("\nHierarchical Inheritance:");
        Cat c=new Cat();
        c.sound();  
        c.meow();
    }
}

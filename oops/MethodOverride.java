// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Animal a = new Animal();  // Base class object
        Dog d = new Dog();        // Subclass object

        a.sound();  // Calls Animal's method
        d.sound();  // Calls overridden Dog's method
    }
}

public class ConstructorOverload {

    // Default constructor
    ConstructorOverload() {
        System.out.println("Default constructor");
    }

    // Constructor with one int parameter
    ConstructorOverload(int x) {
        System.out.println("Constructor with one int: " + x);
    }

    // Constructor with a string and int
    ConstructorOverload(String name, int age) {
        System.out.println("Constructor with String and int: " + name + ", " + age);
    }

    public static void main(String[] args) {
        ConstructorOverload obj1 = new ConstructorOverload();
        ConstructorOverload obj2 = new ConstructorOverload(10);
        ConstructorOverload obj3 = new ConstructorOverload("Alice", 25);
    }
}

public class MethodOverload {

    // Method with no parameters
    void show() {
        System.out.println("Show method with no arguments");
    }

    // Method with one string parameter
    void show(String name) {
        System.out.println("Show method with one argument: " + name);
    }

    // Method with two int parameters
    void show(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        obj.show();
        obj.show("Java");
        obj.show(10, 20);
    }
}

public class WithArgWithReturn {
    // Method with argument and with return
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int result = square(5);
        System.out.println("Square is: " + result);
    }
}

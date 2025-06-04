import static java.lang.Math.*;

public class Task9 {

    // Method for addition using addExact()
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    // Method for subtraction using subtractExact()
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    // Method for multiplication using multiplyExact()
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    // Method for division using floorDiv()
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        }
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        // Demonstrate math operations with different values
        int num1 = 20;
        int num2 = 5;

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
    }
}

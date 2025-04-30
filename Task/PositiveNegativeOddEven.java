import java.util.Scanner;

public class PositiveNegativeOddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // Read input correctly
        int number = input.nextInt(); 

        // Check if the number is positive, negative, or zero
        if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else {
            System.out.println(number + " is zero.");
        }

        // Check if the number is even or odd (excluding zero)
        if (number != 0) {
            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }
        }

        input.close(); // Close scanner to avoid resource leak
    }
}

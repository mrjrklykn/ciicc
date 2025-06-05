import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        long size = scanner.nextLong();  // Change from `int` to `long`

        // Validate input size
        if (size <= 0) {
            System.out.println("Error: The number of elements must be greater than zero.");
            scanner.close();
            return;
        }

        // Create an array to store numbers
        long[] numbers = new long[(int) size]; // Convert size to int for array

        // Input the numbers
        System.out.println("Enter " + size + " numbers:");
        long sum = 0;
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextLong(); // Change from `nextInt()` to `nextLong()`
            sum += numbers[i];
        }

        // Calculate and display results
        double average = (double) sum / size;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for three numbers from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Check if all numbers are equal
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else {
            // Find the largest number
            int largest = Math.max(num1, Math.max(num2, num3));
            System.out.println("The largest number is: " + largest);
        }

        // Close the scanner
        scanner.close();
    }
}

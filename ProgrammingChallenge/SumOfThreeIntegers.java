import java.util.Scanner;

public class SumOfThreeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter three integers:");

        // Loop to read exactly three integers
        for (int i = 0; i < 3; i++) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                return;
            }
        }

        // Display the result
        System.out.println("Total Sum: " + sum);
        scanner.close();
    }
}

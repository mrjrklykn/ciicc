import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Create a StringBuilder and reverse the input string
        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();
        
        // Check if the original string is equal to the reversed string
        if (input.equals(reversedString.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
        
        // Close the scanner
        scanner.close();
    }
}

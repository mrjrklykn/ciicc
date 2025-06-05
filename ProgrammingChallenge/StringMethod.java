import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // 1. Find and print the length of the string
        System.out.println("1. Length of the string: " + userInput.length());

        // 2. Convert the string to uppercase and print it
        System.out.println("2. Uppercase: " + userInput.toUpperCase());

        // 3. Convert the string to lowercase and print it
        System.out.println("3. Lowercase: " + userInput.toLowerCase());

        // 4. Print the first character of the string
        System.out.println("4. First character: " + userInput.charAt(0));

        // 5. Print the last character of the string
        System.out.println("5. Last character: " + userInput.charAt(userInput.length() - 1));

        // 6. Print the substring from the second character to the fifth character
        if (userInput.length() >= 5) {
            System.out.println("6. Substring (2nd to 5th character): " + userInput.substring(1, 5));
        } else {
            System.out.println("6. Substring operation not possible (string too short)");
        }

        scanner.close();
    }
}

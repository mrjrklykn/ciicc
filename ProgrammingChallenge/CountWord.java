import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine().trim(); // Trim to remove extra spaces at start/end

        // Check if input is empty
        if (userInput.isEmpty()) {
            System.out.println("No words entered.");
        } else {
            // Split the string using spaces and count words
            String[] words = userInput.split("\\s+"); // Splitting based on multiple spaces
            System.out.println("Word count: " + words.length);
        }

        scanner.close();
    }
}

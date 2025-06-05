import java.util.Scanner;

public class StringBuilderIto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string");
        String input = scanner.nextLine();

        // Check if input meets length requirement
        if (input.length() < 10) {
            System.out.println("Error: String must be at least 10 characters long.");
            scanner.close();
            return;
        }

        // Create StringBuilder object
        StringBuilder sb = new StringBuilder(input);

        // Print length of the string
        System.out.println("1. Length of the string: " + sb.length());

        // Print first character
        System.out.println("2. First character: " + sb.charAt(0));

        // Print last character
        System.out.println("3. Last character: " + sb.charAt(sb.length() - 1));

        // Print index of first occurrence of 'a'
        int indexOfA = sb.indexOf("a");
        if (indexOfA != -1) {
            System.out.println("4. First occurrence of 'a' is at index: " + indexOfA);
        } else {
            System.out.println("4. The letter 'a' is not present in the string.");
        }

        // Print substring from index 3 to index 6
        System.out.println("5. Substring from index 3 to 6: " + sb.substring(3, 7));

        // Append "123" to the end
        sb.append("123");
        System.out.println("6. After appending \"123\": " + sb);

        // Insert "xyz" at index 4
        sb.insert(4, "xyz");
        System.out.println("7. After inserting \"xyz\" at index 4: " + sb);

        // Delete substring from index 2 to index 4
        sb.delete(2, 4);
        System.out.println("8. After deleting substring from index 2 to 4: " + sb);

        // Delete the character at index 8
        if (sb.length() > 8) {
            sb.deleteCharAt(8);
            System.out.println("9. After deleting character at index 8: " + sb);
        } else {
            System.out.println("9. Cannot delete character at index 8 (String is too short)");
        }

        // Reverse the string and print
        sb.reverse();
        System.out.println("10. Reversed string: " + sb);

        scanner.close();
    }
}

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number (1-7): ");

        // Check if input is an integer
        if (scanner.hasNextInt()) {
            int dayNumber = scanner.nextInt();
            String day;

            // Determine the day using switch-case
            switch (dayNumber) {
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
                case 7:
                    day = "Sunday";
                    break;
                default:
                    day = "Invalid input";
            }

            // Display result
            System.out.println(day);
        } else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}

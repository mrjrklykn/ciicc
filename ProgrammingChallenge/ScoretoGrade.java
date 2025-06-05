import java.util.Scanner;

public class ScoretoGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        // Determine the grade
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the result
        System.out.println("The student's grade is: " + grade);

        scanner.close();
    }
}

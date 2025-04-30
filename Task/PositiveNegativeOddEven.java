import java.util.Scanner;
public class PositiveNegativeOddEven {

    public static void main(String[] args) {
        Scanner nice = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = nice.nextInt(); 

        if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else {
            System.out.println(number + " is zero.");
        }
     
        if (number != 0) {
            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }
        }
        nice.close();
    }
}

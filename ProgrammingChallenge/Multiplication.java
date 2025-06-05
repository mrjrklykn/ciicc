public class Multiplication {
    public static void main(String[] args) {
        // Print header
        System.out.println("10x10 Multiplication Table:");

        // Generate multiplication table using nested loops
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t"); // Print product with tab spacing
            }
            System.out.println(); // Move to the next row
        }
    }
}

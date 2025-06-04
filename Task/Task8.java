public class Task8 {
    
    // Method to compute the total sum and cumulative sum for each parameter
    public static void computeSums(int... numbers) {
        int totalSum = 0;
        
        System.out.println("Cumulative sums for each number:");
        for (int num : numbers) {
            int cumulativeSum = 0;
            
            // Calculate cumulative sum up to the current number
            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }
            
            System.out.println(num + " = " + cumulativeSum);
            
            // Add to total sum
            totalSum += num;
        }

        // Print the total sum of all parameters
        System.out.println("Total sum of all parameters: " + totalSum);
    }

    public static void main(String[] args) {
        // Example call with parameters (4, 5, 10)
        computeSums(4, 5, 10);
    }
}


public class Task113 {

    public static void main(String[] args) {

      int i;
      String message;
      int check_number = 10;

        for ( i = 1; i <= check_number; i++) 
        {
           message =(i%2==0)? i+ " is even number " : i+ " is odd number.";
           System.out.println(message);
          }
    }
}
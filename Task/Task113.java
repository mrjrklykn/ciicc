
public class Task113 {

    public static void main(String[] args) {

      int i;
      String message;
        for ( i = 1; i < 11; i++) 
        {
           message =(i%2==0)? i+ " is even number " : i+ " is odd number.";
           System.out.println(message);
          }
    }
}
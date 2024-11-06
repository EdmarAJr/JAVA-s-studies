/******************************************************************************

Prime number or not?
Max Score: 10 | Difficulty: Not Specified
Take a number as inout and print whether or not it's a prime.
Note: Print yes if it's a prime and print no if not a prime.

Input:
13
Output:
yes

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number = keyboard.nextInt();
      keyboard.close();
      int prime=0;
      for (int i = 2; i <= number; i++) {
            if (number % i ==0) {
                prime++;
            }
        }

      if (prime < 2) {
          System.out.println("yes");
      } else {
          System.out.println("no");
      }
  }
}

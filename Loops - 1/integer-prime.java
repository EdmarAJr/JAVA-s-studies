/******************************************************************************

Question 7
Max Score: 2 | Difficulty: Not Specified
Take an integer and print "YES" if the integer is prime and "NO" if it is not.

Constraints:
2 <= N <= 1000

Input:
A single integer
Output:
A string "YES" or "NO"

Example:
Input
3
Output
YES

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
          System.out.println("YES");
      } else {
          System.out.println("NO");
      }
  }
}

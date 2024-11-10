/******************************************************************************

Question 11
Max Score: 2 | Difficulty: Not Specified
Take a 3 digit integer, print "YES" if the reversed integer is equal to the input. Print "NO" otherwise.

Constraints:
99 < input < 1000

Input
A three digit integer
Output:
YES if the reversed input is equal to the input. NO if is not.

Example:
Input:
899
Output:
NO

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number = keyboard.nextInt();
      keyboard.close();

       
      int originalNumber = number;
      int reversed = 0;

      while (number > 0) {
        reversed = reversed * 10 + number % 10;
        number /= 10;
      }

      if (originalNumber == reversed) {
          System.out.println("YES");
      } else {
          System.out.println("NO");
      }
    }
}

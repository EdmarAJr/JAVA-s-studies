/******************************************************************************

Question 3
Max Score: 2 | Difficulty: Not Specified
Take an integer as input and return "POSITIVE" if the integer is positive, "NEGATIVE" if the integer is negative and "ZERO" if the integer is zero.

Constraints:
-10000 <= input <= 10000

Input:
A single integer
Output:
A single line containing a string "POSITIVE" if the input is positive, "NEGATIVE" if the input is negative and "ZERO" if the input is zero.

Example:
Input:
12
Output:
POSITIVE

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       int number = keyboard.nextInt();
       keyboard.close();

      if(number == 0){
        System.out.println("ZERO");
      }
      else if (number < 0) {
          System.out.println("NEGATIVE");
      } 
      else {
          System.out.println("POSITIVE");
      }
    }
}

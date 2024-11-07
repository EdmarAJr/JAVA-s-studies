/******************************************************************************

Question 5
Max Score: 2 | Difficulty: Not Specified
Take an integer and return its absolute value.

Constraints:
-1000 <= input <= 1000

Input:
A single integer
Output:
Absolute value of the input integer.

Example:
Input:
-12
Output:
12

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number = keyboard.nextInt();
      keyboard.close();
      
      System.out.println(Math.abs(number));
  }
}

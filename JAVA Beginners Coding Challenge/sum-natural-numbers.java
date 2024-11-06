/******************************************************************************

Sum of 'N' natural numbers
Max Score: 7 | Difficulty: Not Specified
Take a number (n) as input and print sum of the n natural numbers

Input:
10
Output:
55

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number = keyboard.nextInt();
      keyboard.close();

      System.out.println((number+1)*(number/2));
  }
}

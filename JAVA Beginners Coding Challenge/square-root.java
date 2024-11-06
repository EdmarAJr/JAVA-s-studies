/******************************************************************************

Square root of the given number
Max Score: 9 | Difficulty: Not Specified
Take a number as input and print the square root of that number.

Input:
16
Output:
4

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number = keyboard.nextInt();
      keyboard.close();
      
      System.out.println((int) Math.sqrt(number));
  }
}

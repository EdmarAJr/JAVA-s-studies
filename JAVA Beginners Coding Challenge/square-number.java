/******************************************************************************

Square of a number
Max Score: 5 | Difficulty: Not Specified
Take a number as input and calculate the square of that number

Input:
4
Output:
16

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       int number = keyboard.nextInt();
       keyboard.close();

      System.out.println(number*number);
  }
}

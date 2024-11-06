/******************************************************************************

Given number Positive or Negative
Max Score: 5 | Difficulty: Not Specified
Take a number as input and tell its positive or negative

Input:
-42
Output:
negative

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       int number = keyboard.nextInt();
       keyboard.close();

      if (number < 0) {
          System.out.println("negative");
      } else {
          System.out.println("positive");
      }
    }
}

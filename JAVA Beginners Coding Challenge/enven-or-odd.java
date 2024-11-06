/******************************************************************************

Even or Odd?
Max Score: 5 | Difficulty: Not Specified
Take a number as input and tell its even or odd number

Input:
89
Output:
odd

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
       int number = keyboard.nextInt();
       keyboard.close();

      if (number%2 == 0) {
          System.out.println("even");
      } else {
          System.out.println("odd");
      }
  }
}

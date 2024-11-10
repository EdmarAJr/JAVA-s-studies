/******************************************************************************

Factorial of a number
Max Score: 7 | Difficulty: Not Specified
Take a number as an input and print the factorial of that number.

Input:
5
Output:
120

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number = keyboard.nextInt();
      keyboard.close();
      int factorial=1;
      
      while(number > 0){
        factorial*=number;
        number--;
      }

      System.out.println(factorial);
  }
}

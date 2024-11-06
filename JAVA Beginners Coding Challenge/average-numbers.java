/******************************************************************************

Average of given 3 numbers
Max Score: 6 | Difficulty: Not Specified
Take 3 numbers from the input and print the average of those numbers

Input:
2
4
9
Output:
5

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        int number3 = keyboard.nextInt();
        keyboard.close();

        System.out.println((number1+number2+number3)/3);
  }
}

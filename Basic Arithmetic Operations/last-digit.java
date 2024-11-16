/******************************************************************************

Question 7
Max Score: 2 | Difficulty: Not Specified
Take a number and print out the last digit of the number

Constraints:
0 < number <= 1000000

Input:
An integer

Output:
Last digit of the input integer

Example:

Input:
12

Output:
2

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number = keyboard.nextInt();
      keyboard.close();
      
      System.out.println(number%10);
    }
}

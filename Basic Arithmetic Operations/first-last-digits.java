/******************************************************************************

Question 8
Max Score: 2 | Difficulty: Not Specified
Take a 2 digit number and return the first and last digits

Constraints:
9 < number < 100

Input:
A two digit integer
Output:
Two integers (each in a new line) which are the first and last digits of the input integer

Example:

Input:
98

Output:
9
8

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number = keyboard.nextInt();
      keyboard.close();
      
      System.out.println(number/10);
      System.out.println(number%10);
    }
}

/******************************************************************************

Question 10
Max Score: 2 | Difficulty: Not Specified
Take a 3 digit number and print the reverse of that number

Constraints:
99 < number < 100

Input:
A single three digit integer
Output:
A three digit integer obtained by reversing the input integer.

Example:
Input:
987
Output:
789

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number = keyboard.nextInt();
      keyboard.close();
      int reversed =0;
      
      while(number>0){
        reversed = reversed*10+number%10;
        number /= 10;
      }
      
      System.out.println(reversed);
    }
}

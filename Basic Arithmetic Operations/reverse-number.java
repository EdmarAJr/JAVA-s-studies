/******************************************************************************

Question 9
Max Score: 2 | Difficulty: Not Specified
Take a 2 digit number and print the reverse of that number

Constraints:
9 < number < 100

Input:
A two digit integer
Output:
A two digit integer obtained by reversing the input number

Example:
Input:
94
Output:
49

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

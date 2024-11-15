/******************************************************************************

Question 3
Max Score: 2 | Difficulty: Not Specified
Take two numbers a,b and print the exponential power of the first number raised by the second

Constraints:
0 < a, b <= 1000

Input:
Two numbers - a,b
Output:
b^a

Example:

Input:
2
3

Output:
8

Explanation:
a = 2, b = 3;
a^b = 2^3 = 8

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int a = keyboard.nextInt();
      int b = keyboard.nextInt();
      keyboard.close();
      
      if((a>0 && a<=1000) && (b>0 && b<=1000)){
        System.out.println((int) Math.pow(a,b));
      }
  }
}

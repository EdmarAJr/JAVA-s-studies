/******************************************************************************

Question 2
Max Score: 3 | Difficulty: Not Specified
Take two numbers and only print the integer part when a is divided by b

Constraints:
0 <= a <= 1000
0 < b <= 1000

Input:
Two numbers - a,b
Output:
Integer part of the result a/b

Example:
Input:
10
4

Output:
2

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number1 = keyboard.nextInt();
      int number2 = keyboard.nextInt();
      keyboard.close();
      
      if((number1>0 && number1<=1000) && (number2>0 && number2<=1000)){
          System.out.println(number1/number2);
      }
  }
}

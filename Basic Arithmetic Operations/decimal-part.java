/******************************************************************************

Question 4
Max Score: 2 | Difficulty: Not Specified
Take two numbers a,b and only print the decimal part of the result obtained when a is divided by b

Constraints:
0 <= a <= 1000
0 < b <= 1000

Input:
Two numbers - a, b
Output:
Decimal part (with a precision of 2 digits) of the quotient obtained when a is divided by b.

Example:

Input:
23
4
Output:
0.75

Explanation:
a = 23, b = 4;
a/b = 5.75
Decimal part = 0.75

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int a = keyboard.nextInt();
      int b = keyboard.nextInt();
      keyboard.close();
      
      float result = (float) a / b;
      float decimalPart = result - (int) result;
      
      if(decimalPart > .2 && decimalPart <= .8){
        System.out.printf("%.2f%n", decimalPart);  
      } else{
        System.out.println(Math.round(decimalPart));
      }
      
  }
}

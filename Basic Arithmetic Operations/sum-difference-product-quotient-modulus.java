/******************************************************************************

Question 1
Max Score: 2 | Difficulty: Not Specified
Take two numbers a,b and print the sum, difference, product, quotient and modulus of a & b.

Constraints:
1 <= a,b <= 1000

Input:
Two numbers - a,b

Output:
Sum, difference, product, quotient and modulus operation results on a,b

Example:
Input:
10
3
Output:
13
7
30
3.3333333333333335
1

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number1 = keyboard.nextInt();
      int number2 = keyboard.nextInt();
      keyboard.close();
      
      
      if(number1 > number2 || number1 < number2){
        System.out.println((int)number1 + (int)number2);
        System.out.println((int)number1 - (int)number2);
        System.out.println((int)number1 * (int)number2);
        System.out.println((double) number1/number2);
        System.out.println((int)number1 % (int)number2);  
      } else{
        System.out.println((int)number1 + (int)number2);
        System.out.println((int)number1 - (int)number2);
        System.out.println((int)number1 * (int)number2);
        System.out.println(Math.round(number1/number2));
        System.out.println((int)number1 % (int)number2);  
      }
  }
}


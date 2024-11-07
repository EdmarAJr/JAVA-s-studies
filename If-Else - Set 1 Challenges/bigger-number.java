/******************************************************************************

Question 1
Max Score: 2 | Difficulty: Not Specified
Take two numbers a,b and return the bigger number.

Constraints:
0 <= a,b <= 1000

Input:
Two numbers - a,b each in a new line
Output:
Bigger number about a,b

Example:

Input:
3
5
Output:
5

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number = keyboard.nextInt();
      keyboard.close();
      int fibonacci = 0;
  
      int a = 0, b = 1;

      for (int i = 0; i < number; i++) {
        System.out.print(a + ", ");
        int next = a + b; 
        a = b; 
        b = next;
      }
      System.out.print(a);
  }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number1 = keyboard.nextInt();
      int number2 = keyboard.nextInt();
      keyboard.close();
      if(number1>number2){
        System.out.println(number1);
      }
      else{
        System.out.println(number2);
      }
  }
}
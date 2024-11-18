/******************************************************************************

Question 11
Max Score: 2 | Difficulty: Not Specified
Enter 2 numbers a,b - exchange their values using third variable and print them

Constraints:
0 < a,b < 1000

Input:
Two integers - a,b each in a new line
Output:
Integers a,b after being reversed using a third varible.

Example:

Input:
244
566

Output:
566
244

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int a = keyboard.nextInt();
      int b = keyboard.nextInt();
      keyboard.close();
      int c = a;
      a=b;
      b=c;
  
      System.out.println(a);
      System.out.println(b);
    }
}

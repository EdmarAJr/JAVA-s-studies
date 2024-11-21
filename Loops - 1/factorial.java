/******************************************************************************

Question 6
Max Score: 2 | Difficulty: Not Specified
Take an integer and return the factorial.

Constraints:
0 < n <= 100

Input:
A single integer
Output:
A single integer eaual to the factorial of the input integer

Example:
Input:
4
Output:
24

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int a = keyboard.nextInt();
      keyboard.close();
      
      
      if(a==0 || a ==1){
        System.out.println(1);
      } else{
          int n=a;
          int factorial = 1;
          
          while(n>0){
            factorial *= n;
            n--;
        }
        System.out.println(factorial);
      }
  }
}


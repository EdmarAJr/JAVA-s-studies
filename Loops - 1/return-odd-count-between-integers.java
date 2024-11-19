/******************************************************************************

Question 3
Max Score: 2 | Difficulty: Not Specified
Take two integers a,b and return the count of all the odd numbers in between them, inclusive of the input.

Constraints:
0 <= a < b <= 100

Input:
Two integers, each in a new line
Output:
A single integer which equals the count of all the odd numbers in the inclusive range of a and b.

Example:
Input:
2
9

Output:
4

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int a = keyboard.nextInt();
      int b = keyboard.nextInt();
      keyboard.close();
      int n=a;
      int count = 0;
      
      while(n<=b){
        if(n%2!=0){
          count++;
        }
        n++;
      }
      System.out.println(count);
  }
}

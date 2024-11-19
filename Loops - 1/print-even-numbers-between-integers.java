/******************************************************************************

Question 2
Max Score: 2 | Difficulty: Not Specified
Take two integers a,b and print all the even numbers in between them, excluding the input integers.

Constraints:
0 <= a < b <= 100

Input:
Two integers each in a new line.

Output:
Each line in the output contains an even integer between a,b in ascending order.

Example:
Input:
3
12

Output:
4
6
8
10

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int a = keyboard.nextInt();
      int b = keyboard.nextInt();
      keyboard.close();
      int n = a+1;
      while(n<b){
        if(n%2==0){
          System.out.println(n);
        }
        n++;
      }
  }
}

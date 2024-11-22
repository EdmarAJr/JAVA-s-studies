/******************************************************************************

Question 8
Max Score: 2 | Difficulty: Not Specified
Take 10 integers as input and print their product.

Constraints:
1 <= T <= 100

Input:
Ten lines of input containing ten integers each.
Output:
Print the product of all the ten integers.

Example:
Input:
1
2
3
4
5
6
7
8
9
10
Output:
3628800

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      
      int numbers[] = new int[10];
      
      for (int i=0;i<10;i++) {
        numbers[i] = keyboard.nextInt();
      }
      int product=1; 
      for (int i=0;i<10;i++) {
        product *= numbers[i];
      }
      System.out.println(product);
        
  }
}

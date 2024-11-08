/******************************************************************************

Question 7
Max Score: 2 | Difficulty: Not Specified
Take 4 distinct integers a,b,c, d and return the integer of largest value.

Constraints:
0 <= a,b,c, d <= 1000

Input:
Four integers each in a seperate line
Output:
A single integer with the largest value among the input.

Example:
Input:
2
3
10
4
Output:
10

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int[] numbers = new int[4];
      for (int i=0;i<numbers.length; i++) {
        numbers[i] = keyboard.nextInt();
      }
      keyboard.close();
      int largest  = numbers[0];
      for (int i=0;i<numbers.length; i++){
        if (numbers[i]>largest ) {
          largest  = numbers[i];
        }
      }
      System.out.println(largest );
       
    }    
}

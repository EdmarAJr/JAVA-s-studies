/******************************************************************************

Question 8
Max Score: 2 | Difficulty: Not Specified
Take 3 distinct integers a,b,c as input and return the second smallest among the input.

Constraints:
-1000 <= a,b,c <= 1000

Input:
Three integers each in a seperate line
Output:
A single integer with the second smallest value among the input

Example:
Input:
1
2
3
Output:
2

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int[] numbers = new int[3];
      
      for (int i=0;i<numbers.length; i++) {
        numbers[i] = keyboard.nextInt();
      }
      keyboard.close();
      
      Arrays.sort(numbers);

      System.out.println(numbers[1]);
      
    }    
}

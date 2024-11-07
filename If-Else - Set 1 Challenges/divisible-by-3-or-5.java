/******************************************************************************

Question 4
Max Score: 2 | Difficulty: Not Specified
Take an integer and return "YES" if the input is divisible by 3 or 5 or both. "NO" in all other cases

Constraints:
0 <= input <= 1000

Input:
A single integer

Output
A single line with a string "YES" if the input is divisible by 3 or 5 or both. "NO" in all other cases.

Example:
Input:
12
Output:
YES

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number = keyboard.nextInt();
      keyboard.close();
      
      if(number%3==0 || number%5==0){
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
  }
}

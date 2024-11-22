/******************************************************************************

Question 5
Max Score: 2 | Difficulty: Not Specified
Take an integer and print the multiplication table of the interger upto a factor of 10 in this form -> n x 1 = n

Constraints:
0 < n <= 100

Input:
A single integer
Output:
10 lines of output, each with the multiplication of the form mentioned above, in ascending order

Example:
Input:
2
Output:
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int a = keyboard.nextInt();
      keyboard.close();
      int n=1;
      int multiplication = 1;
      while(n<=10){
        multiplication=a*n;
        System.out.println(a + " x " + n + " = " + multiplication);
        
        n++;
      }
  }
}

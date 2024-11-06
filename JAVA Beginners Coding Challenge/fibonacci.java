/******************************************************************************

First 'N' fibonacci numbers
Max Score: 10 | Difficulty: Not Specified
Take a number (N) as input and print the first N fibonacci numbers separated by , (comma and a space)

Input:
20
Output:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765

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

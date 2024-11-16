/******************************************************************************

Question 6
Max Score: 2 | Difficulty: Not Specified
Take the cost price a and selling price b of a product, and print the profit obtained on the product.

Constraints:
0 < prices <= 1000

Input:
Two numbers - a, b cost price and selling price respectively
Output:
A number which is the profit obtained with given cost price and selling price

Example:

Input:
120
590

Output:
470

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      double a = keyboard.nextDouble();
      double b = keyboard.nextDouble();
      keyboard.close();
      double cost = (b-a);
        
      System.out.printf("%d%n", (int) cost);
    }
}


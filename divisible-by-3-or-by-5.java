/******************************************************************************

Question 15
Max Score: 2 | Difficulty: Not Specified
Enter a number and print "Hello" if divisible by 3. Print "World" if divisible by 5. And print "HelloWorld" if divisble by 15. Print "No" if the number is divisible by neither 3 nor 5.

Constraints:
0 <= number <= 100

Input:
A single integer
Output:
A single line with string according to the conditions mentioned above

Example:
Input: 30
Output:
HelloWorld

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number = keyboard.nextInt();
      keyboard.close();
      if (number >= 0 && number <= 1000) {
        if(number%3==0){
          System.out.print("Hello");
        }
      if(number%5==0){
        System.out.print("World");
      }
      if(!(number%3==0 || number%5==0)){
        System.out.print("No");
      }
    }
  }
}

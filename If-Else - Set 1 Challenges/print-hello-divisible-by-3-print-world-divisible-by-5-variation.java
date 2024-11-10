/******************************************************************************

Question 16
Max Score: 2 | Difficulty: Not Specified
Take a number , print "Hello" if the number is divisible by 3, print "World" if the number is divisible by 5, or print "HelloWorld" if the number is divisible by both 3 and 5.
if all these conditions are false than print the number itself

Input:
input a number
Output
Output will be the string

Example:
Input:
3
Output:
Hello

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
        System.out.print(number);
      }
    }
  }
}

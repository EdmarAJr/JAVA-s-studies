/******************************************************************************

Question 6
Max Score: 2 | Difficulty: Not Specified
Take 3 distinct integers a,b,c and return the integer of largest value.

Constraints:
0 <= a,b,c <= 1000

Input:
Three integers each in a seperate line
Output:
A single integer with the largest value among the input.

Example:
Input:
2
3
4
Output:
4

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        int number3 = keyboard.nextInt();
        keyboard.close();

        if (number1 > number2 && number1 > number3) {
          System.out.println(number1);
        } else if (number2 > number1 && number2 > number3){
            System.out.println(number2);
        } else{
          System.out.println(number3);
        }
    }    
}

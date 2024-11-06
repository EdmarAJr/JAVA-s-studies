/******************************************************************************

Find largest number from given 2 numbers
Max Score: 5 | Difficulty: Not Specified
Take two numbers as input from the user and print the largest number out of those two numbers.

Input
234
220
Output
234

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        keyboard.close();

        if (number1 > number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }
}

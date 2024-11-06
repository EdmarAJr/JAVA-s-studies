/******************************************************************************

Find largest number from given 3 numbers
Max Score: 5 | Difficulty: Not Specified
Take three numbers as input from the user and print the largest number out of those three numbers.

Input
234
210
345
Output
345

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

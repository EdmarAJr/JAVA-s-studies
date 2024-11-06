/******************************************************************************

Word representation for a number
Max Score: 5 | Difficulty: Not Specified
Take a number between 0 to 9 as input and print the word representation for that number.

Input
7
Output
seven

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        keyboard.close();

        switch(number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("Invalid number. Please, take a number between 0 and 9.");
        }
    }
}

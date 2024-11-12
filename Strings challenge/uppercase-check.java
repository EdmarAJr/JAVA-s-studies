/******************************************************************************

Uppercase check
Max Score: 5 | Difficulty: Not Specified
Take a string from the input and check all the letters in the string are of upper case

Input(1):
OC
Output(1):
true
Input(2):
oc
Output(2):
false

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        
        keyboard.close();
        
        if (word.toUpperCase() == word) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}


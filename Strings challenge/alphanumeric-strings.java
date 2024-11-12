/******************************************************************************

Alphanumeric strings
Max Score: 5 | Difficulty: Not Specified
Take a string from the input and check whether or not it contains both letters and numerals

Input(1):
R2D2
Output(1):
true
Input(2):
OC
Output(2):
false

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        
        keyboard.close();
        
        boolean hasLetter = false;
        boolean hasDigit = false;
        
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            
            if (hasLetter && hasDigit) {
                break;
            }
        }
        
        if (hasLetter && hasDigit) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

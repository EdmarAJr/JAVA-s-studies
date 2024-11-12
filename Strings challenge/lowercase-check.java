/******************************************************************************
Lowercase check
Max Score: 5 | Difficulty: Not Specified
Take a string from the input and check all the letters in the string are of lower case

Input:
OC
Output:
false
Input:
oc
Output:
true

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        
        keyboard.close();
        
        if (word.toLowerCase() == word) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}


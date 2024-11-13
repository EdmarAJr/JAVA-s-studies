/******************************************************************************

Remove occurrences of a char
Max Score: 8 | Difficulty: Not Specified
Take a string from the input and remove all occurrences of given char from that string

Input:
abcdefghabcdefgh
b
Output:
acdefghacdefgh

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        char character = keyboard.next().charAt(0);
        keyboard.close();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != character) {
                result.append(word.charAt(i));
            }
        }
        System.out.print(result.toString());
    }
}

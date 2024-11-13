/******************************************************************************

Remove vowels
Max Score: 6 | Difficulty: Not Specified
Take a string from the input and remove the vowels and print it

Input:
Harry
Output:
Hrry

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        keyboard.close();
        
        StringBuilder result = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (!isVowel(c)) {
                result.append(c);
            }
        }
        
        System.out.println(result.toString());
    }
    
    private static boolean isVowel(char c) {
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
    }
}

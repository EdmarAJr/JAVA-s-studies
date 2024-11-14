/******************************************************************************

Count vowels and consonants
Max Score: 10 | Difficulty: Not Specified
Count the total vowels and consonants in a given string and print them

Input:
Harry Potter
Output:
3
9

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        keyboard.close();
        
        int count = 0;
        int count2 = 0;
        
        for (char c : word.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
            if (!isVowel(c)) {
                count2++;
            }
        }
        
        System.out.println(count);
        System.out.println(count2);
    }
    
    private static boolean isVowel(char c) {
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
    }
}
	}
}

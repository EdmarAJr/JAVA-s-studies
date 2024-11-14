/******************************************************************************

Search for a word
Max Score: 9 | Difficulty: Not Specified
Search a word existence inside a given string

Input:
Wikipedia is a free online encyclopedia, created and edited by volunteers around the world
online
Output:
true

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        String search = keyboard.nextLine();
        keyboard.close();
        
        String[] parts = word.split(" ");
        
        boolean found = false;
        
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].equals(search)) {
                found = true;
                break;
            }
        }
        
        System.out.println(found ? "true" : "false");
    }
}

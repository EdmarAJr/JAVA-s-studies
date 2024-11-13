/******************************************************************************

Split strings by comma
Max Score: 5 | Difficulty: Not Specified
Take a string from the input and split the strings with comma. Print the new strings one per line

Input:
a,b,c,d
Output:
a
b
c
d

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        keyboard.close();
        
        String[] parts = word.split(",");
        
        for (String part : parts) {
            System.out.println(part);
        }
    }
}


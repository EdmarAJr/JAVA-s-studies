/******************************************************************************

Reverse the character case
Max Score: 7 | Difficulty: Not Specified
Take a string from the input and change lowercase characters to uppercase and uppercase characters to lowercase

Input:
Harry
Output:
hARRY

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        keyboard.close();

        StringBuilder result = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c); // Se o caractere não for uma letra, mantém o mesmo.
            }
        }

        System.out.println(result.toString());
    }
}

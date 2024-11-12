/******************************************************************************

Reverse a string
Max Score: 5 | Difficulty: Not Specified
Take a string from the input and print it in reverse

Tom
Output:
moT

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        keyboard.close();
        
        StringBuilder reversedWord = new StringBuilder(word);
        reversedWord.reverse();
        
        System.out.println(reversedWord.toString());
    }
}

/*ou*/

// public class Main {
//     public static void main(String[] args) {
//         Scanner keyboard = new Scanner(System.in);
//         String word = keyboard.nextLine();
//         keyboard.close();
        
//         char[] charArray = word.toCharArray();
        
//         for (int i=0; i<word.length()/2; i++) {
//             int j=word.length()-1-i;
//             char temp=charArray[i];
//             charArray[i]=charArray[j];
//             charArray[j]=temp;
//         }
        
//         String result = new String(charArray);
        
//         System.out.print(result);
//     }
// }

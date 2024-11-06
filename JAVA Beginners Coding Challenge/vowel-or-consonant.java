/******************************************************************************

Vowel or a Consonant?
Max Score: 4 | Difficulty: Not Specified
Take a character as an input and print whether it is an vowel or a consonant. Sample input and output are shown as below:

Input(1):
a
Output(1):

vowel
Input(2):
c
Output(2):
consonant

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
    	char caracter = keyboard.next().charAt(0);
    	keyboard.close();
      char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
      boolean isVowel = false;
      for (int i=0; i<10; i++) {
        if(caracter == vowels[i]){
          isVowel = true;
          break;
        }
      }
      if(isVowel){
        System.out.println("vowel");
      } 
      else {
        System.out.println("consonant");
      }
    }
}

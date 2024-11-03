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

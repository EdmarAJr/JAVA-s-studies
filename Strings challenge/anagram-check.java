/******************************************************************************

Anagram check
Max Score: 10 | Difficulty: Not Specified
Check the given 2 strings are anagrams.

Hint: anagram means the strings contains same characters but order of characters is not important

Note: Ignore considering the case or spaces.

Input(1):
Listen
Silent
Output(1):
true
Input(1):
School master
The classroom
Output(1):
true

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      String word1 = keyboard.nextLine();
      String word2 = keyboard.nextLine();
      keyboard.close();
      
      word1 = word1.replaceAll("\\s", "").toLowerCase();
      word2 = word2.replaceAll("\\s", "").toLowerCase();
        
      if(word1.length() == word2.length()){
       
        char[] parts1 = word1.toCharArray();
        char[] parts2 = word1.toCharArray();
      
        Arrays.sort(parts1);
        Arrays.sort(parts2);
      
        if(Arrays.equals(parts1, parts2)){
          System.out.println("true");
        }else{
          System.out.println("false");
        }
      } 
      else{
        System.out.println("false");
      }
      
  }
}

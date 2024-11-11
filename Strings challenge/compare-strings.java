/******************************************************************************
Compare the Strings
Max Score: 3 | Difficulty: Not Specified
Take two strings from the input and print whether or not the strings are equal

Input(1):
Hello
Hi
Output(1):
false
Input(2):
Hello
Hello
Output(2):
true

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      String word1 = keyboard.nextLine();
      String word2 = keyboard.nextLine();
      keyboard.close();
      
      if (word1.equals(word2)) {
        System.out.println("true");
      } 
      else {
        System.out.println("false");
      }
  }
}

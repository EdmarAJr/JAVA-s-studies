/******************************************************************************

String lengths equal or not
Max Score: 5 | Difficulty: Not Specified
Take two strings from the input and check the lengths of those strings equal or not

Input:
Peter
Griffin
Output:
false

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      String word1 = keyboard.nextLine();
      String word2 = keyboard.nextLine();
      
      if(word1.length() == word2.length()){
        System.out.println("true");
      }
      else{
        System.out.println("false");
      }
      
  }
}

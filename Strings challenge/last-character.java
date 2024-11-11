/******************************************************************************

Last character of a string
Max Score: 3 | Difficulty: Not Specified
Take a string from the input and print the last character of that string

Input:
World
Output:
d

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      String word = keyboard.nextLine();
      keyboard.close();
      
      System.out.println(word.charAt(word.length()-1));
  }
}

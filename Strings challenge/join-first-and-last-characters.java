/******************************************************************************

Join first & last characters of a string
Max Score: 4 | Difficulty: Not Specified
Take a string from the input and print the first character and last characters of the string together

Input:
Hello World
Output:
Hd

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      String word = keyboard.nextLine();
      keyboard.close();
      
      System.out.print(word.charAt(0));
      System.out.print(word.charAt(word.length()-1));
  }
}

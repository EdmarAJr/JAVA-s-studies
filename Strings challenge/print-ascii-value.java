/******************************************************************************

Print ascii value
Max Score: 8 | Difficulty: Not Specified
Take a string from the input and print ascii character

Input:
A
Output:
65

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      char character = keyboard.next().charAt(0);
      keyboard.close();
      
     System.out.printf("%d%n", (int) character);
  }
}

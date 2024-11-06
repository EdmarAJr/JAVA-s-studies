/******************************************************************************

Scan name of user and say Hello
Max Score: 3 | Difficulty: Not Specified
Write a program to scan the name of the user and say hello to them.

Example input:

Peter
Example output:

Hello Peter

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
    	String name = keyboard.nextLine();
      
      System.out.println("Hello "+ name);
  }
}

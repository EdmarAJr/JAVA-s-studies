/******************************************************************************
Join the strings
Max Score: 2 | Difficulty: Not Specified
Take two strings from the input, join those two strings with a space and print the new string

Input:
Harry
Potter
Output:
Harry Potter

*******************************************************************************/

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      String word1 = keyboard.nextLine();
      String word2 = keyboard.nextLine();
      keyboard.close();
      System.out.println(word1 + " " + word2);
  }
}

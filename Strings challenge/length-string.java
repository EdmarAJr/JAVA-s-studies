/******************************************************************************
Length of a string
Max Score: 1 | Difficulty: Not Specified
Take a string from the input and print the length of that string

Input:
OneCompiler
Output:
11

*******************************************************************************/

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      String word = keyboard.nextLine();
      
      System.out.println(word.length());
  }
}
/******************************************************************************

Integers SUM
Max Score: 5 | Difficulty: Not Specified
Read two numbers as input and print the sum of the two given numbers. Sample input and output are shown as below

Input
3
4
Output
7

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       int number1 = keyboard.nextInt();
       int number2 = keyboard.nextInt();
       keyboard.close();

      System.out.println(number1+number2);
  }
}

/******************************************************************************

Question 2
Max Score: 2 | Difficulty: Not Specified
Take a number and return "ODD" if the number is odd and "EVEN" if the number is even

Constraints:
0 <= number <= 10000

Input:
An integer
Output:
A single line with the string "ODD" if the input is an odd number and "EVEN" if the input is even

Example:
Input:
22
Output:
EVEN

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int number = keyboard.nextInt();
    keyboard.close();
      
    if(number%2==0){
      System.out.println("EVEN");
    }
    else{
      System.out.println("ODD");
    }  
  }
}

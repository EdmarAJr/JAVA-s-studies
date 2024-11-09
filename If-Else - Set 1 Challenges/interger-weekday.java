/******************************************************************************

Question 12
Max Score: 2 | Difficulty: Not Specified
Take an integer ranging from 0 - 6 as input and print out the corresponding weekday. 0 corresponds to Sunday and 6 corresponds to Saturday.

Constraints:
0 <= input <= 6

Input:
A single integer from 0 to 6

Output
A single line with string containing the weekday corresponding to the input.
0 -> Sunday
1 -> Monday
2 -> Tuesday
3 -> Wednesday
4 -> Thursday
5 -> Friday
6 -> Saturday

Example:
Input:
1
Output:
Monday

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int number = keyboard.nextInt();
      keyboard.close();
      
      switch(number){
        case 0:
          System.out.println("Sunday");
          break;
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        default:
          System.out.println("Invalid number. Please take a number between 0 and 6");
      }
  }
}

/******************************************************************************

Question 10
Max Score: 2 | Difficulty: Not Specified
Take a 4 digit integer denoting a year and print out "YES" if it is a leap year and "NO" if it is not a leap year.

Constraints:
1000 <= input <= 9999

Input:
A single line with a four digit integer denoting the year
Output:
A single line with string "YES" if the input year is a leap year and "NO" if it is not.

Example:
Input:
2022
Output:
NO

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
        int year = keyboard.nextInt();
        keyboard.close();
        
        if(year%400 == 0){
          System.out.println("YES");
        }
        else if((year%100)%4 == 0){
          System.out.println("YES");
        } 
        else{
          System.out.println("NO");
        }
      
  }
}

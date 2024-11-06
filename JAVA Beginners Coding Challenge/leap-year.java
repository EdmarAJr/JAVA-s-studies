/******************************************************************************

Leap year or not ?
Max Score: 5 | Difficulty: Not Specified
Take a year as input and tell whether or not it's a leap year.
Print yes If it's a leap year and print no if it's not a leap year.

Input:
2000
Output:
yes

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
        int year = keyboard.nextInt();
        keyboard.close();
        
        if(year%400 == 0){
          System.out.println("yes");
        }
        else if((year%100)%4 == 0){
          System.out.println("yes");
        } 
        else{
          System.out.println("no");
        }
      
  }
}

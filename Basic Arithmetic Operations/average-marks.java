/******************************************************************************

Question 5
Max Score: 2 | Difficulty: Not Specified
Take marks in 5 subjects A,B,C,D,E and print out the average of marks from five subject marks.

Constraints:

0 <= marks (in each subject) <= 100

Input:
Marks in five subjects each in a new line. (Take a look at the example)
Output:
Average marks of the five subjects (For consistency, please round the result to two decimal places)

Example:
Input:
45
93
23
45
65

Output:
54.2

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      float[] numbers = new float[5];
      for (int i=0;i<numbers.length; i++) {
        numbers[i] = keyboard.nextInt();
      }
      keyboard.close();
      float average = 0;
      for (int i=0;i<numbers.length; i++){
        average+=numbers[i];
      }
      
      System.out.println(Math.round(average/numbers.length));
    }    
}


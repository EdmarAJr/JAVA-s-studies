/******************************************************************************

Question 13
Max Score: 2 | Difficulty: Not Specified
Take marks in five subjects,find the average and return the corresponding grade .
Rules for grade:
Average > = 90 - A
Average > = 80 and less than 90 - B
Average > = 70 and less than 80 - C
Average > = 50 and less than 70 - D
Other cases: F

Constraints:
0 <= marks in each subject <= 100

Input:
Five integers, one in each line
Output:
Single line with string containing the grade based on the average calculated

Example:
Input:
100
90
80
70
60

Output:
B

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int grade1 = keyboard.nextInt();
      int grade2 = keyboard.nextInt();
      int grade3 = keyboard.nextInt();
      int grade4 = keyboard.nextInt();
      int grade5 = keyboard.nextInt();
      keyboard.close();
      int average  = (grade1+grade2+grade3+grade4+grade5)/5;
      
      if((grade1>=0 && grade2>=0 && grade3>=0 && grade4>=0 && grade5>=0) && 
      (grade1<=100 && grade2<=100 && grade3<=100 && grade4<=100 && grade5<=100)){
        if(average>=90){
          System.out.println("A");
        } 
        else if(average>=80){
          System.out.println("B");
        }
        else if(average>=70){ 
          System.out.println("C");
        }
        else if(average>=50){
          System.out.println("D");
        } 
        else{
          System.out.println("F");
        } 
      }
  }
}

/******************************************************************************

Question 9
Max Score: 2 | Difficulty: Not Specified
Take 3 integers A,B,C which denote the angles of a triangle, and return 'VALID' if the angles can form a valid triangle or 'NOT VALID' if the angles cannot form a valid triangle. Print the type of triangle in case it is valid

Constraints:
0 <= A,B,C <= 180

Input:
Three integers, each in a seperate line, denoting three angles of a triangle
Output:
First line with a string "VALID" if the input angles can form a valid triangle, or "NOT VALID" if a triangle cannot be formed.
Second line contains "EQUILALTERAL" or "ISOSCELES" or "SCALENE" in case of a "VALID" triangle. Second line remains empty in case of a "NOT VALID" triangle

Example:

Input:
30
60
90
Output:
VALID
SCALENE

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int A = keyboard.nextInt();
      int B = keyboard.nextInt();
      int C = keyboard.nextInt();
      keyboard.close();
      
      if (A+B+C==180 && A > 0 && B > 0 && C > 0) {
        System.out.println("VALID");
        if(A==B && B==C){
          System.out.println("EQUILALTERAL");
        } else if(A != B && B != C){
          System.out.println("SCALENE");
        } else{
          System.out.println("ISOSCELES");
        }
      }
      else{
        System.out.println("NOT VALID");
      }
  }
}

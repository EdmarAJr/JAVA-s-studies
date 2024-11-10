/******************************************************************************

Question 17
Max Score: 2 | Difficulty: Not Specified
Check if a number is even or odd and print it out. Use switch case to solve the problem.

Constraints:
0 <= input <= 1000

Input:
An integer
Output:
EVEN if the integer is even
ODD if the integer is odd.

Example:
Input:
12
Output:
EVEN

*******************************************************************************/
mport java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int number = keyboard.nextInt();
    keyboard.close();
    
    int solution = number%2;
      
    switch(solution)  {
      case 0:
        System.out.println("EVEN");
        break;
      default:
        System.out.println("ODD");
        
    }
  }
}

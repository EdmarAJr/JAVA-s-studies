/******************************************************************************
Question 4
Max Score: 2 | Difficulty: Not Specified
Print the sum of all even numbers from 1 to 100.

Input:
No input will be provided.
Output:
A single integer equal to the sum of all even numbers from 1 to 100.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n=1;
      int count=0;
      while(n<=100){
        if(n%2==0){
          count+=n;
        }
        n++;
      }
      
      System.out.println(count);
  }
}

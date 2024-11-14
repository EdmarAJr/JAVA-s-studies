/******************************************************************************

Palindrome check
Max Score: 10 | Difficulty: Not Specified
Check whether or not the given string is a palindrome

Input:
civic
Output:
true

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
      String word = keyboard.nextLine();
      keyboard.close();
      
      word = word.replaceAll("\\s", "").toLowerCase();
      boolean isPalindrome = false;
      
      int left = 0;
      int right = word.length() - 1;
        
        while (left < right) {
            if (word.charAt(left) == word.charAt(right)) {
                isPalindrome = true;
            }
            left++;
            right--;
        }
      
      System.out.println(isPalindrome);
   
  }
}

/*ou*/

public class Main {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
      String word = keyboard.nextLine();
      keyboard.close();
      
      word = word.replaceAll("\\s", "").toLowerCase();
       char[] parts = word.toCharArray();
       int count=0;
       for(int i=0;i<parts.length/2;i++){
         if(parts[i] == parts[parts.length-1-i]){
           count++;
         }
       }
      
       if(count == parts.length/2){
         System.out.println("true");
       }else{
         System.out.println("false");
       }
      
  }
}

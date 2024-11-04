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

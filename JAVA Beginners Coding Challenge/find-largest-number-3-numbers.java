import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        int number3 = keyboard.nextInt();
        keyboard.close();

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1);
        } else if (number2 > number1 && number2 > number3){
            System.out.println(number2);
        } else{
          System.out.println(number3);
        }
    }    
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        keyboard.close();

        if (number1 > number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }
}

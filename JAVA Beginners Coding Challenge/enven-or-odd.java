import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
       int number = keyboard.nextInt();
       keyboard.close();

      if (number%2 == 0) {
          System.out.println("even");
      } else {
          System.out.println("odd");
      }
  }
}

import java.io.IOException;
import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
          int a,b;
          double c;
          Scanner input = new Scanner(System.in);
          a = input.nextInt();
          b = input.nextInt();
          c = input.nextDouble();
          System.out.printf("NUMBER = %d\n", a);
          System.out.printf("SALARY = U$ %.2f\n", b * c);
    }  
}

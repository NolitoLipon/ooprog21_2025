// This application displays some math facts
import java.util.Scanner;

class DebugThree2 {
   public static void main(String args[])
   {
      int a, b, c;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      a = input.nextInt();
      System.out.print("Enter a second integer >> ");
      b = input.nextInt();
      System.out.print("Enter a third integer >> ");
      c = input.nextInt();
      add(a, b, c);
      add(b, c, a);
      add(a, c, b);
      subtract(a, b, c);
      subtract(b, c, a);
      subtract(a, c, b);
   }
   public static void add(int a, int b, int c) {
      System.out.println("The sum of " + a + ","  + b +
         " and " + c + " is " + (a + b + c));
   }
   public static void subtract(int a, int b, int c) {
      System.out.println("The difference between " +
         a +  ","  + b + " and " + c + " is " + (a - b - c));
   }
}


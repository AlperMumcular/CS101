import java.util.Scanner;

/**
 * Interesting number PI
 * @author Alper Mumcular
 * @version 21.02.2020
 */ 
public class Lab02a
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // constants
      double PI_NUMBER = Math.PI;
      String MATH_PI ="PI";
      // variables
      int n;
      // program code
      System.out.println("Hello World!");
      System.out.println("This is the magic number: " + MATH_PI);
      System.out.println("****   *     *");
      System.out.println("   *   *    *");
      System.out.println("****   *   *");
      System.out.println("   *   *  *   *");
      System.out.println("**** * * ******");
      System.out.println("              *");
      //take input from the user
      System.out.print( "Enter the desired number of digits for pi: " );
      n = scan.nextByte();
      //give output to the user
      System.out.printf("%." + n +"f", PI_NUMBER);
      System.out.println();
   }
}
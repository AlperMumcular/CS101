import java.util.Scanner;
import java.util.Locale;

/**
 * Largest perfect square less than the input 
 * @author Alper Mumcular
 * @version 12.03.2020
 */ 
public class Lab04a
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      scan.useLocale(Locale.US);
      
      // constants
      final int TWO = 2;
      final int ONE = 1;
      final int ZERO = 0;
      
      // variables      
      double input;
      int perfectSquare;
      int number;
      
      // program code
      System.out.print( "Enter a positive integer n >= 2:" );
      input = scan.nextDouble();
      
      // checking input > 1 
      if (input < TWO && (input % ONE) != ZERO) {
         System.out.println("The input n should be positive >= 2 and an integer. Exiting...");         
      }
      else if (input < TWO) {
         System.out.println("The input n should be positive > 1. Exiting...");
      }
      else if ((input % ONE) != ZERO) {
         System.out.println("The input n should be an integer. Exiting...");
      }  
      
      // calculation largest perfect square less than input 
      else {
         perfectSquare = ONE;
         number = ONE;
         while (perfectSquare < input) {       
            number++;
            perfectSquare = number * number;
         }
         if (perfectSquare >= input) {
            number--;
            perfectSquare = number * number;
         }
         System.out.printf("The largest perfect square less than %.0f is %d ( %d ^ 2 )%n", input, perfectSquare, number); 
      }
   }
}
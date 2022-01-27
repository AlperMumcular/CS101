import java.util.Scanner;

/**
 * Histogram 
 * @author Alper Mumcular
 * @version 23.04.2020
 */ 
public class Histogram
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // constants

      // variables
      int number;
      String result;
      
      // program code
      result = "";
      System.out.print( "Enter the numbers: " );
      for ( number = scan.nextInt(); number >= 0; number = scan.nextInt()) {
         result += number + "  ";
         while ( number > 0 ) {
            result += "*";
            number--;
         }
         result += "\n";
      }      
      System.out.println( "Output: \n" + result );
   }
}
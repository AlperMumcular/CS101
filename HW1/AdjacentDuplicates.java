import java.util.Scanner;

/**
 * Adjacent Duplicates 
 * @author Alper Mumcular
 * @version 23.04.2020
 */ 
public class AdjacentDuplicates
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // constants

      // variables
      int number1, number2, count;
      
      // program code
      count = 1; 
      System.out.print( "Enter the numbers: " );
      number1 = scan.nextInt();
      System.out.println( "Adjacent Duplicate, Occurrence Count" );
      do 
      {
      number2 = scan.nextInt();
      if ( number1 == number2 ) {
         count++;
      }
      else if ( number1 != number2 && count > 1 ) {
         System.out.println( number1 + ", " + count );
         count = 1;
      }
      number1 = number2;
      } while ( number2 != 0 );

   }
}
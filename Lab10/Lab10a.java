import java.util.Scanner;

/**
 * polynomial calculator 
 * @author Alper Mumcular
 * @version 14.05.2020
 */ 
public class Lab10a
{  
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      
      // variables
      int[] coefficients;
      int n;
      int x;
      
      // program code
      System.out.print( "Please enter the value of N: " );
      n = scan.nextInt();
      coefficients = new int[n+1];
      for( int i = n; i >= 0; i--) {
         System.out.print( "Please enter the coefficient a" + i + ": "); 
         coefficients[i] = scan.nextInt();
      }
      do {
         System.out.print( "\nPlease enter the X value: " );
         x = scan.nextInt();
         System.out.println( "************************" );
         if( x != 0 ) {
            System.out.println( "for X = " + x );
            printPolynomial( coefficients, x, calculatePolynomial( x, coefficients ) );            
         }
      } while( x != 0 );
   }
   
   /**
    * prints the polynomial
    * @param array --> coefficients, x --> variable, result --> result of the polynomial
    */
   public static void printPolynomial( int[] array, int x, int result ) {
      String str;
      str = "";
      for( int i = array.length - 1, a = 1; i >= 1; i--, a++) {
         str += array[i] + "(" + x + " ^ " + (array.length - a) + ") + ";
      }
      str += array[0] + " = " + result;
      System.out.println( str );
   }
   
   /**
    * calculates the polynomial
    * @param x --> variable, array --> coefficients
    * @return result of the polynomial
    */
   public static int calculatePolynomial( int x, int[] array ) {
      int value;
      value = 0;
      for(int i = array.length - 1; i >= 0; i--) {
         value += (int) (array[i] * Math.pow( x, i ));
      }
      return value;
   }
}
import java.util.Scanner;
import java.util.ArrayList;

/**
 *  
 * @author Alper Mumcular
 * @version 07.05.2020
 */ 
public class Lab09c
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      ArrayList<Integer> array = new ArrayList<Integer>();

      // variables
      int input;
      
      // program code
      input = 1;
      System.out.print( "Please enter the values:" );
      while( input != 0) {
         input = scan.nextInt();
         array.add(input);
      }
      
      System.out.println("Output list: " + solution1(array) );
      System.out.println("Output list: " + solution2(array) );
   }
   
   /**
    * multiplies all numbers and divide index
    * @param array --> tests
    * @returns result as String
    */
   public static String solution1( ArrayList<Integer> array ) {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      int multiply;
      String result;
      result = "{ ";
      multiply = 1;
      for( int n = 0; array.get(n) != 0 && n < array.size(); n++) {
         multiply *= array.get(n);
      }
      for( int n = 0; array.get(n) != 0 && n < array.size(); n++) {
         numbers.add(multiply / array.get(n));
      }
      for( int n = 0; n <= numbers.size() - 2; n++ ) {
         result = result + numbers.get(n) + ", ";
      } 
      result = result + numbers.get(numbers.size() - 1) + " }";
      return result;
   }
   
   /**
    * multiplies all numbers except the index
    * @param array --> tests
    * @returns result as String
    */
   public static String solution2( ArrayList<Integer> array ) {
      array.remove( array.size() - 1 );
      String result;
      int multiply;
      result = "{ ";
      multiply = 1;
      for( int n = 0; n < array.size(); n++) {
         for( int x = array.size() - 1; x >= 0; x-- ) {
            if( x != n )
               multiply *= array.get(x);
         }
         result = result + multiply + ", ";
         multiply = 1;
      }
      result = result.substring( 0, result.length() - 2) + " }";
      return result;
          
   }
}
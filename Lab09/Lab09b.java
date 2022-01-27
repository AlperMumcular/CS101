import java.util.Scanner;
import java.util.ArrayList;

/* Lab09b 
 *
 * @author Alper Mumcular
 * @version 07.05.2020
 * 
 */
public class Lab09b {

   public static void main( String[] args ) {

      Scanner scan = new Scanner( System.in );
      
      /************* You should not change here unless you want to add more test cases ************/                      
      // constants
      final String test1 = "1 2 2 31";
      final String test2 = "6 5 4 4";
      final String test3 = "1 3 2";
      final String test4 = "1 2 4 5";
      final String test5 = "1 1 1";
      final String test6 = "19 11 7 8 5";
      final String test7 = "";
      
      // variables
      ArrayList<String> testList;
      ArrayList<Boolean> correctResultList;
      
      // program code
      testList = new ArrayList<String>();
      testList.add( test1 );
      testList.add( test2 );
      testList.add( test3 );
      testList.add( test4 );
      testList.add( test5 );
      testList.add( test6 );
      testList.add( test7 );
      
      correctResultList = new ArrayList<Boolean>();
      correctResultList.add( true );
      correctResultList.add( true );
      correctResultList.add( false );
      correctResultList.add( true );
      correctResultList.add( true );
      correctResultList.add( false );
      correctResultList.add( true );
      
      /***********************************************************************************************/
      
      // TODO      
      // Here you should use the methods properly and construct the table. 
      System.out.printf("%20s    |  %8s     |\n", "Run", "Expected");
      System.out.printf("%-41s\n", "-----------------------------------------");
      for( int n = 0; n < testList.size(); n++) {
         System.out.printf("|%9s   |   %-5b  |   %-5b       |\n", "Test " + (n + 1), isMonotonic(parseString( testList.get(n) ) ), correctResultList.get(n));
         System.out.printf("%-41s\n", "-----------------------------------------");
      }
   }
   
   
   // TODO
   /**
    * Parses the given string and creates a ArrayList with the values
    * @param str String to be parsed
    * @return ArrayList with values parsed from the String str
    */
   public static ArrayList<Integer> parseString( String str ) {
      // implement here
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      String number = "";
      for( int n = 0; n <= str.length() - 1; n++) {
         if( str.charAt(n) == ' ' ) {
            numbers.add( Integer.parseInt(number) );
            number = "";
         }
         else if( n == str.length() - 1 ) {
            number += str.charAt(n);
            numbers.add( Integer.parseInt(number));
         }
         else
            number += str.charAt(n);
      }
      return numbers;
   }
   
   // TODO
   /**
    * Finds out whether the given ArrayList is monotonic or not
    * @param list ArrayList to be checked whether it is monotonic or not
    * @return true or false
    */
   public static boolean isMonotonic( ArrayList<Integer> list ) {
      // implement here
      int increase, decrease;
      increase = 0;
      decrease = 0;
      for( int n = 0; n <= list.size() - 2; n++ ) {
         if( list.get(n) > list.get(n + 1) ) 
            decrease++;
         else if( list.get(n) < list.get(n + 1) ) 
            increase++;        
      }
      
      if( (decrease == 0 && increase >= 0) || (increase == 0 && decrease >= 0) )
         return true;
      else
         return false;

   }    

}

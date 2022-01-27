import java.util.Scanner;

/**
 * String Concatenator
 * @author Alper Mumcular
 * @version 05.03.2020
 */ 
public class Lab03a
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // constants
      String FIRST_INPUT;
      String SECOND_INPUT;

      // variables
      String firstString;
      String secondString;
      int length1;
      int length2;
      String lastChar;
      String firstChar;
      String secondStringv2;
      
      // getting string inputs
      FIRST_INPUT = "Please enter the first string: ";
      SECOND_INPUT = "Please enter the second string: ";
      System.out.print(FIRST_INPUT);
      firstString = scan.nextLine();
      System.out.print(SECOND_INPUT);
      secondString = scan.nextLine();
      
      //determine the length of the strings
      length1 = firstString.length();
      length2 = secondString.length();
      
      //if last char of first string and first char of second string are same
      if (length1 != 0 && length2 != 0 ) {
         lastChar = firstString.substring(length1 - 1);
         firstChar = secondString.substring(0, 1);
         if ( lastChar.compareTo( firstChar ) == 0 ) {
            secondStringv2 = secondString.substring( 1, length2 );
            System.out.println(firstString + secondStringv2);
         }
         else {
            System.out.println(firstString + secondString);
         }
      }  
      else {
         System.out.println(firstString + secondString);
      }
   }  
}
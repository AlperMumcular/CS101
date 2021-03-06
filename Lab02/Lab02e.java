import java.util.Scanner;

/**
 * String operations
 * @author AlperMumcular
 * @version 21.02.2020
 */ 
public class Lab02e
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // constants
      String FIRST_ENTER = "Enter the first string: ";
      String SECOND_ENTER = "Enter the second string: ";
      String THIRD_ENTER = "Enter an integer: ";
      String FOURTH_ENTER = "Final String: ";
      String FIFTH_ENTER = "The length of the final string: "; 
      // variables
      String firstString;
      String secondString;
      String firstSubString;
      String secondSubString1;
      String secondSubString2;
      String lastString;
      int integer;
      int length1;
      int length2;
      // program code
      System.out.print(FIRST_ENTER);
      firstString = scan.nextLine();
      length1 = firstString.length();
      firstSubString = firstString.substring( 1, length1 - 1 );
      System.out.print(SECOND_ENTER);
      secondString = scan.nextLine();
      System.out.print(THIRD_ENTER);
      integer = scan.nextInt();
      secondSubString1 = secondString.substring( 0, integer);
      secondSubString2 = secondString.substring( integer + 1 );
      System.out.println(FOURTH_ENTER + firstSubString + " " + secondSubString1 + secondSubString2);
      lastString = firstSubString + secondSubString1 + secondSubString2;
      length2 = lastString.length();
      System.out.println(FIFTH_ENTER + length2);                                  
   }
}
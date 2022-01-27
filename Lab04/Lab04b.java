import java.util.Scanner;

/**
 * is there any y after x ?? 
 * @author Alper Mumcular
 * @version 12.03.2020
 */ 
public class Lab04b
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      
      // constants
      final char X = 'x';
      final char Y = 'y';
      final String BALANCED = "This string is xy-balanced.";
      final String NOT_BALANCED = "This string is not xy-balanced.";
      final int ZERO = 0;
      final int MINUS_ONE = -1;
      
      // variables
      String input;
      int n;
      char char1;
      
      // program code
      System.out.print("Please enter a string: ");
      input = scan.nextLine();     
      n = input.length() - 1;
      
      //Is input has a character?
      if (input.length() != ZERO) { // if yes, check chars from back to front
         while (n >= ZERO && n <= input.length() - 1) {
            char1 = input.charAt(n);
            if (char1 == Y){
               System.out.println(BALANCED);
               n = input.length(); // stop the loop
            }
            else if (char1 == X){ 
               System.out.println(NOT_BALANCED);
               n = input.length(); // stop the loop
            }
            else {
               n --;
               if ( n == MINUS_ONE) { // if there is no x and y
                  System.out.println(BALANCED);
               }
            }            
         }
      }
      // no character print the result
      else {
         System.out.println(BALANCED);
      }      
   }
}



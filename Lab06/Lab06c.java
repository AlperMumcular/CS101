import java.util.Scanner;

/**
 * Encryption  
 * @author Alper Mumcular
 * @version 09.04.2020
 */ 
public class Lab06c
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // variables
      String message;
      
      // program code
      System.out.print( "Please enter a message: " );
      message = scan.nextLine();
      System.out.println( "Encoded message: " + encryption(message) );
   }
   
   /**
    * A simple Java class that makes the encryption with the given string input from the user as parameter
    */
   public static String encryption (String str)
   {
      // properties
      int n, row, column, cryptHelper;
      String crypt;
      crypt = "";
      
      // deleting space chars
      for (n = 0; n < str.length(); n++) {
         if (str.charAt(n) == ' ') {
            str = str.substring(0, n) + str.substring(n + 1);
            n--;   
         }
      }      
      
      // encryption part
      if (Math.sqrt(str.length()) % 1 != 0)
         column = (int) Math.sqrt(str.length()) + 1;
      else 
         column =  (int) Math.sqrt(str.length());
      for (cryptHelper = 1; cryptHelper <= column ; cryptHelper++) {
         for (row = cryptHelper - 1; row < str.length(); row += column) {
            crypt += str.charAt(row);
         }
         crypt += " ";
      }
      return crypt;
   }
}
import java.util.Scanner;

/**
 * Program for Bran
 * @author Alper Mumcular
 * @version 26.03.2020
 */ 
public class Lab05a
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // variables
      String str1;
      String str2;
      int n;
      char first;
      char second;
      
      // getting string input
      System.out.print("Please enter a string:");
      str1 = scan.next();
      
      // comparing chars with case-insensitive 
      for ( n = 0; n < str1.length() - 1; n++) {
         first = str1.charAt(n);
         first = Character.toLowerCase(first);
         second = str1.charAt(n + 1);
         second = Character.toLowerCase(second);
         if (first == second){
            str1 = str1.substring(0, n) + str1.substring(n + 2);
            n = -1;
         }       
      }
      
      // checking last value of str1+
      if(str1.length() == 0) {
         System.out.println("---> Empty String");
         System.out.println("The final string is empty."); 
      }
      else {
         n = str1.length() - 1;
         str2 = "";
         do {
            str2 = str2 + str1.charAt(n); 
            n--;
         } while (n >= 0) ;
         System.out.println("---> " + str1);
         System.out.println("Reverse: " + str2);
      }
   }
}
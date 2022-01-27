import java.util.Scanner;

/**
 * using methods for binaries and decimal
 * @author Alper Mumcular 
 * @version 09.04.2020
 */ 
public class Lab06a
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // variables
      int n;
      String str; 
      
      // program code
      System.out.print( "Enter an integer n: " );
      n = scan.nextInt();
      System.out.println( "The binary representation is " + toBinary( n ) );
      str = toBinary( n );
      System.out.println( "The decimal value is: " + toDecimal ( str ) );
      if (toDecimal( str ) == n)
         System.out.println( "They are equal." );
   }
   /**
    * A simple Java class that converts given integer n ,from the input as parameter, into binary
    */
   public static String toBinary( int n ) 
   {
      String binary;
      int power;
      binary = "";
      power = 2;
      
      // finding how many 0 or 1 we use in binary
      while (n > power) {
         power = power * 2;
      }
      if (n != power) {
         power = power / 2;
      }
      
      // decide 1 or 0 we use
      do {
         if ( n / power == 1) {
            binary += "1";
            n = n - power;
         }
         else {
            binary += "0";      
         }
         power = power / 2;        
      } while ( power != 0 );
      
      return binary;
   }
   /**
    * A simple Java class that converts the given binary as parameter into decimal
    */
   public static int toDecimal ( String binary )
   {
      // variables
      int x, sum;
      sum = 0;
      
      // binary string ---> decimal 
      for ( x = 0; x < binary.length(); x++) {
         sum += binaryCharAt(x, binary) * powerOfTwo( x, binary);
      }
      return sum;
   }  
   
   /**
    * A simple Java class that calculates the power of two with given n (charAt(binary)) 
    * and binary as parameters
    */ 
   public static int powerOfTwo ( int n, String binary )
   {
      int power, x;
      x = binary.length() - 1 - n;
      power = 1;
      while (x > 0) {
         power = power * 2;
         x--;
      }
      return power;
   }
   
   /**
    * A simple Java class that converts binary chars to integer 1 or 0 with given x(place of the char in binary string) 
    * and binary string as parameters
    */
   public static int binaryCharAt ( int x, String binary ) {
      int n;
      n = 0;
      if (binary.charAt(x) == '1') {
         n = 1; 
      }
      return n;
   }
}
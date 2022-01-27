import java.util.Scanner;
import java.util.Random;

/**
 * String includes each char occurs an odd numbers of times 
 * @author Alper Mumcular
 * @version 09.04.2020
 */ 
public class Lab06b
{
   static Random r = new Random();
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // variables
      int n;
      
      // program code
      do {
      System.out.print("Input: ");
      n = scan.nextInt();
      if (n < 0) 
         System.out.println("Input should be greater than or equal to 0 ");
      else if (n > 0) 
         System.out.println("Output: " + generateTheString ( n ) );
      } while ( n != 0);
   }
   /**
    * A simple Java class that creates a string with each chars occur an odd number of times
    * with the given input from the user as parameter
    */
   public static String generateTheString( int n ) 
   {
      //variables
      char a,b,c;
      int x, order;
      String str, str1;
      
      // random chars
      a = (char)randomChar();
      b = (char)randomChar();
      c = (char)randomChar();
      
      // being sure that variables aren't same char
      while(a == b)
         b = (char)randomChar();
      while(b == c || a == c)
         c = (char)randomChar();
      
      str = "";
      str1 = "";
      
      // if input is even number
      if(n % 2 == 0)
      {
         for(int i = 0; i < n ; i++)
         {
            if( i != n - 1 )
               str = str + a;
            else
               str = str + b;
         }
      }
      
      // if input is odd number
      else
      {
         for(int i = 0; i < n ; i++)
         {
            if( i == n - 1 )
               str = str + c;
            else if( i == n - 2 ) 
               str = str + b;
            else
               str = str + a;
         }
      }
      
      // changing chars' order randomly
      order = str.length();
      x = r.nextInt(order);
      do {
         str1 += str.charAt(x);
         str = str.substring(0, x) + str.substring(x + 1);
         order--;
         if (order != 0)
            x = r.nextInt(order);
      } while (order >= 1);

      return str1;
   }
   
   /**
    * A simple Java class that creates a random char
    */
   public static int randomChar()
   {
      char x;
      x = (char)(r.nextInt(26) + 'a');
      return x;
   }
}
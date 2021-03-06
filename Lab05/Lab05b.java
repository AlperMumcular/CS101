import java.util.Scanner;

/**
 * F(n) calculator
 * @author Alper Mumcular 
 * @version 26.03.2020
 */ 
public class Lab05b
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      
      // variables
      int n;
      int i;
      long fibonacci1;
      long fibonacci2;
      long fibonacci3;
      
      // validating the user input
      System.out.print("Please enter a value for n: ");
      for ( n = scan.nextInt(); n < 0;) {
         System.out.println("Invalid value has been entered.");
         System.out.print("Please enter a value for n: ");
         n = scan.nextInt();                         
      } 
      
      // calculate F(n) and print
      for (i = 0, fibonacci1 = 0, fibonacci2 = 1; i <= n; i++) {
         System.out.printf("Fib(%d) = %d\n", i, fibonacci1);
         fibonacci3 = fibonacci2 + fibonacci1;
         fibonacci1 = fibonacci2;
         fibonacci2 = fibonacci3;
      }
   }
}
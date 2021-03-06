import java.util.Scanner;

/**
 * Menu Driven Program
 * @author Alper Mumcular
 * @version 26.03.2020
 */ 
public class Lab05d
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // variables
      String input, firstString, secondString, common, str1;
      int n, k, x;
      double r, a, precision, sum;
      
      // program code
      do {
         System.out.println( "**** Make your selection ****" );
         System.out.println( "Strings" );
         System.out.println( "Math" );
         System.out.println( "Exit" );
         System.out.print( "Your selection: " );
         input = scan.next(); 
         
         if (input.equalsIgnoreCase("Strings")) { // if the user choose string
            System.out.println("** Semazen-Strings **");
            System.out.print("Enter a string: ");
            firstString = scan.next();
            System.out.print("Enter another string: ");
            secondString = scan.next();
            common = " ";
            
            for (n = 0; n <= firstString.length(); n++) { // loop for to detect if they are semazen-strings 
               str1 = firstString.substring(n) + firstString.substring(0, n);
               if (str1.equalsIgnoreCase( secondString )) {
                  System.out.println("They are semazen-strings.");
                  n = firstString.length();
               }
               else if (n == firstString.length()) { // if they aren't semazen-strings
                  firstString = firstString.toLowerCase();
                  secondString = secondString.toLowerCase();
                  System.out.print("Common characters: ");
                  for (k = 0; k < secondString.length(); k++) { // loop for to detect common chars
                     for (n = 0; n < firstString.length(); n++) {
                        if (secondString.charAt(k) == firstString.charAt(n)) {                                                                                      
                           for (x = 0; x < common.length(); x++ ) {
                              if (common.charAt(x) == secondString.charAt(k)) { // printing common chars only once
                                 x = common.length();
                              }
                              else if (x == common.length() - 1) {
                                 System.out.print(secondString.charAt(k) + " ");
                                 common = common + secondString.charAt(k);
                              }
                           }
                           
                        }
                     }
                  }
                  System.out.println();
               }
            }
            System.out.println();
         }
         
         else if (input.equalsIgnoreCase("Math")) { // if the user choose math
            System.out.println("** Infinite Geometric Sum Calculation **");
            System.out.print("Enter an r: ");
            r = scan.nextDouble();
            System.out.print("Enter an a: ");
            a = scan.nextDouble();
            System.out.print("Enter precision: ");
            precision = scan.nextDouble();
            
            for (sum = 0; Math.abs(a) >= Math.abs(r) * precision; a = a * r) { // loop for infinite sum
               sum += a;
               System.out.println("Current result is: " + sum);
            }
            System.out.println("Result is: " + sum);
         }
                                    
      } while (!input.equalsIgnoreCase("exit"));
      System.out.println("Goodbye!");   
   }
}
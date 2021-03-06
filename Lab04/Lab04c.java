import java.util.Scanner;

/**
 * While statement exercise with numbers
 * @author Alper Mumcular
 * @version 12.03.2020
 */ 

public class Lab04c
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // constants
      final String SEPERATOR = "------------------- ";
      final int ZERO = 0;
      final int ONE = 1;
      final int TWO = 2;
      final int THREE = 3;
      final int FOUR = 4;
      final int FIVE = 5;
      
      // variables
      double input;
      int oddNumbers;
      int perfectSquare;
      int part2;
      int n;
      int inputHelper;
      int inputHelper2;
      double decimal;
      int part3;
      int divisors;

      // program code
      System.out.print("Please enter a value for n: ");
      input = scan.nextDouble();
      
      // validating the input
      while (input < ONE || input != (int) input) {
         if (input < ONE) {
            System.out.print("Please enter a value for n: ");
            input = scan.nextDouble();
         }
         else if (input != (int) input) {
            System.out.print("Please enter a value for n: ");
            input = scan.nextDouble();
         }
      }
      
      // code of first part
      n = ONE;
      System.out.printf("%s%d %s\n", SEPERATOR, n, SEPERATOR);
      oddNumbers = ONE;
      while (oddNumbers <= input) {
         perfectSquare = oddNumbers * oddNumbers;
         System.out.printf("%-6d", perfectSquare);
         if ( oddNumbers % 10 == 9) {
            System.out.println();
         }
         oddNumbers = oddNumbers + TWO;
      }
      System.out.println();
      
      // code of second part
      n++;
      System.out.printf("%s%d %s\n", SEPERATOR, n, SEPERATOR);     
      part2 = ZERO;
      inputHelper = ZERO;
      while ( input >= THREE) {
         if ((input % FOUR == ZERO) && (input % THREE == ZERO)) {
         }
         else if (input % FOUR == ZERO) {
            System.out.printf("%-6.0f", input);
            part2++;
            if (part2 % FIVE == ZERO) {
               System.out.println();           
            }
         }
         else if (input % THREE == ZERO) {
            System.out.printf("%-6.0f", input);
            part2++;
            if (part2 % FIVE == ZERO) {
               System.out.println();           
            }
         }
         
         input--;
         inputHelper++;
      }
      System.out.println();
      
      // code of third part
      n++;
      System.out.printf("%s%d %s\n", SEPERATOR, n, SEPERATOR);
      part3 = ZERO;
      inputHelper2 = ZERO;
      input = input + inputHelper;
      while (input >= ONE) {
         decimal = ONE / input;
         if (decimal > 0.01) {
            System.out.printf("%-6.2f", decimal);
           part3++;
         }
         if (part3 % FIVE == ZERO) {
            System.out.println();
         }
         input--;
         inputHelper2++;
      }
      System.out.println();
      
      // code of fourth part 
      n++;
      System.out.printf("%s%d %s\n", SEPERATOR, n, SEPERATOR);
      divisors = TWO;
      input = input + inputHelper2;
      while (divisors <= input) {
         if (input % divisors == ZERO) {
            System.out.printf("%-1d ", divisors);
         }
         divisors++;
      }
      System.out.println();
   }
}
import java.util.Scanner;

/**
 * numbers with ascending order
 * @author Alper Mumcular
 * @version 05.03.2020
 */ 
public class Lab03c
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      //constants
      String SORTED;
      
      // variables
      int number1;
      int number2;
      int number3;
      
      // program code
      SORTED = " The sorted nums are: ";
      System.out.print("Please enter the integers: ");
      number1 = scan.nextInt();
      number2 = scan.nextInt();
      number3 = scan.nextInt();

      //assuming number1 is smallest or equal to other smallest number(s)
      if ( number1 <= number2 && number1 <= number3) {
         if ( number2 < number3 ) {
            System.out.println(SORTED + number1 + " " + number2 + " " + number3); 
         }
         else {
            System.out.println(SORTED + number1 + " " + number3 + " " + number2);
         }   
      }
      
      //assuming number2 is smallest or equal to number3
      if ( number2 < number1 && number2 <= number3) {
         if ( number1 <= number3 ) {
            System.out.println(SORTED + number2 + " " + number1 + " " + number3);
         }   
         else {
            System.out.println(SORTED + number2 + " " + number3 + " " + number1);
         }
      }
      
      //assuming number3 is smallest 
      if ( number3 < number1 && number3 < number2) {
         if ( number1 < number2 ) {
            System.out.println(SORTED + number3 + " " + number1 + " " + number2);
         }   
         else {
            System.out.println(SORTED + number3 + " " + number2 + " " + number1);
         }
      }      
   }

}
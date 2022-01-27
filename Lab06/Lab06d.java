import java.util.Scanner;

/**
 * Dice game 
 * @author Alper Mumcular
 * @version 09.04.2020
 */ 
public class Lab06d
{   
   /**
    * A simple Java class that rolls the dice, computes and returns the gain 
    * with the given prediction and bet as parameters
    */
   public static double dice ( int prediction, double bet) 
   {
      // variables
      int dice1, dice2, sum;
      double gain;
      
      // rolling dice
      dice1 = (int) (Math.random() * 6 + 1);
      dice2 = (int) (Math.random() * 6 + 1);
      sum = dice1 + dice2;
      gain = 0;
      // win or lose according to prediction
      if (prediction == 1)  {
         if (sum % 2 == 1) {
            gain += bet / 2;
         }
         else {
            gain -= bet / 4;
         }
      }
      else if (prediction == 2) {
         if (sum % 2 == 0) {
            gain += bet / 2;
         }
         else {
            gain -=  bet / 4;
         }           
      }
      else if (prediction == 3) {
         if (sum == 1 || sum == 12) {
            gain += bet;
         }
         else {
            gain -= bet;
         }
      }
      System.out.println("The sum of the dice is " + sum);
      return gain;
   }
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      
      // variable
      int prediction;
      double bet, money;

      // program code
      System.out.print( "Enter your total money: " );
      money = scan.nextDouble();     
      do {
         System.out.print("Enter prediction (1 for ODD, 2 for EVEN, 3 for EXTREME): ");
         prediction = scan.nextInt();
         if (prediction != 0) {
            System.out.print("Enter the amount of money you want to bet: ");
            bet = scan.nextDouble(); 
            
            // if bet is more than money
            while (bet > money) {
               System.out.println("Your money is not enough!");
               System.out.print("Enter the amount of money you want to bet");
               bet = scan.nextDouble();
            }
            
            money = money + dice( prediction, bet );
            // return the result of bet
            System.out.println("Your total money is " + money );
            System.out.println("**************************************");  
         }
      } while (prediction != 0 && money != 0);
   } 
}
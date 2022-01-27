import java.util.Scanner;
import java.util.Locale;

/**
 * practise of sequence of integers
 * @author Alper Mumcular
 * @version 12.03.2020
 */ 
public class Lab04d
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      scan.useLocale(Locale.US);
      
      // constants 
      final int ZERO = 0;
      final int ONE = 1;
      final int SEVEN = 7;
      
      // variables
      int first;
      int second;
      int denominator;
      int prime;
      int max;
      int min;
      int sum;
      int n;
      double average;
      int multiplesOfSeven;
      
      // program code
      prime = ONE;
      n = ZERO;
      multiplesOfSeven = ZERO;
      System.out.print( "Enter a sequence of integers (not-integer to process input) :" );
      
      // if first two input is integer
      if (scan.hasNextInt() && scan.hasNextInt()){          
         first = scan.nextInt();
         max = first;
         min = first;
         if (first % SEVEN == ZERO){
            multiplesOfSeven++;
         }
         second = scan.nextInt();
         sum = first + second;
         n = 2;
         average = (double) sum / n;
         if(second > max){
            max = second;
         }
         if(second < min){
            min = second;
         }
         if (second % SEVEN == ZERO){
            multiplesOfSeven++;
         }
         denominator = first;
         while (second % denominator != ZERO && denominator > ONE) { //if first two integer co-prime
            denominator --;
            if (denominator == ONE) {
               System.out.println("Co-Prime Pairs:");
               System.out.println(first + " - " + second);
               prime = ZERO;
               while(scan.hasNextInt()) { // loop for every new integer
                  first = second;
                  second = scan.nextInt();                
                  sum = sum + second;
                  n++;
                  average = (double) sum / n;
                  if (second > max){
                     max = second;
                  }
                  if(second < min){
                     min = second;
                  }
                  if (second % SEVEN == ZERO){
                     multiplesOfSeven++;
                  }
                  denominator = first;               
                  while (denominator > ONE) {
                     while (!(first % denominator == ZERO && second % denominator == ZERO) && denominator > ONE){                     
                        denominator--;
                        if (denominator == ONE)
                           System.out.println(first + " - " + second);
                     }                 
                     denominator = ONE;
                  }
               }
            }
         }         
         while(scan.hasNextInt()) { // if first two integer is not co-prime and loop for every new integer
            first = second;
            second = scan.nextInt();
            sum = sum + second;
            n++;
            average = (double) sum / n;
            if (second > max){
               max = second;
            }
            if(second < min){
               min = second;
            }
            if (second % SEVEN == ZERO){
               multiplesOfSeven++;
            }
            denominator = first;               
            while (denominator > ONE) {
               while (!(first % denominator == ZERO && second % denominator == ZERO) && denominator > ONE){                     
                  denominator--;
                  if (denominator == ONE) {
                     if (prime == ONE) {
                        System.out.println("Co-Prime Pairs:");                       
                     }
                     System.out.println(first + " - " + second);  
                     prime = ZERO;
                  }
               }                 
               denominator = ONE;
            }
         }
         if (prime == ONE){
            System.out.println("No adjacent pair is co-prime...");
         }
         System.out.println("***************");
         System.out.println("Max: " + max + " Min: " + min);
         System.out.println("Sum: " + sum + " Average: " + average);
         System.out.println("Count: " + n + " Divisible by 7 count: " + multiplesOfSeven);
      }
      
      // if user input is non-integer
      else  {
         System.out.println("No values entered.");
      }                        
   }
}

                   

   
   

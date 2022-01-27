import java.util.Scanner;

/**
 * What is your Zodiac sign
 * @author Alper Mumcular
 * @version 05.03.2020
 */ 
public class Lab03e
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      
      // variables
      int month;
      int day;
      
      // program code
      System.out.print("Please enter your birthday (month and day): ");
      month = scan.nextInt();
      day = scan.nextInt();
      
      //if month or day invalid
      if (month <= 0 || month >= 13) {
         if (day <= 0 || day >= 32) {
            System.out.println("You have entered incorrect month and day!");
         }
         else {
            System.out.println("You have entered incorrect month!");
         }
      }
      else {
         if (day <= 0 || day >= 32) {
            System.out.println("You have entered incorrect day!");
         }
      }
      //1st month                   
      if ( month == 1 ) {
         if ( day <= 19 && day >=1 ) {
            System.out.println("The astrological sign for " + month + " " + day + " is Capricorn");
         }
         else if (day >= 20 && day <= 31) {
            System.out.println("The astrological sign for " + month + " " + day + " is Aquarius");
         }         
      }
      
      //2nd month
      if ( month == 2 ) {
         if ( day <= 18 && day >=1 ) {
            System.out.println("The astrological sign for " + month + " " + day + " is Aquarius");
         }
         else if (day >= 19 && day <= 31) {
            System.out.println("The astrological sign for " + month + " " + day + " is Pisces");
         }         
      }
      
      //3rd month
      if ( month == 3 ) {
         if ( day <= 20 && day >=1 ) {
            System.out.println("The astrological sign for " + month + " " + day + " is Pisces");
         }
         else if (day >= 21 && day <= 31) {
            System.out.println("The astrological sign for " + month + " " + day + " is Aries");
         }         
      }
      
      //4th month
      if ( month == 4 ) {
         if ( day <= 19 && day >=1 ) {
            System.out.println("The astrological sign for " + month + " " + day + " is Aries");
         }
         else if (day >= 20 && day <= 31) {
            System.out.println("The astrological sign for " + month + " " + day + " is Taurus");
         }         
      }
      
      //5th month
      if ( month == 5 ) {
         if ( day <= 20 && day >=1 ) {
            System.out.println("The astrological sign for " + month + " " + day + " is Taurus");
         }
         else if ( day >= 21 && day <= 31 ) {
            System.out.println("The astrological sign for " + month + " " + day + " is Gemini");
         }         
      }
      
      //6th month
      if ( month == 6 ) {
         if ( day <= 20 && day >=1 ) {
            System.out.println("The astrological sign for " + month + " " + day + " is Gemini");
         }
         else if (day >= 21 && day <= 31) {
            System.out.println("The astrological sign for " + month + " " + day + " is Cancer");
         }         
      }
      
      //7th month
      if ( month == 7 ) {
         if ( day <= 22 && day >=1 ) {
            System.out.println("The astrological sign for " + month + " " + day + " is Cancer");
         }
         else if (day >= 23 && day <= 31) {
            System.out.println("The astrological sign for " + month + " " + day + " is Leo");
         }         
      }
      
      //8th month
      if ( month == 8 ) {
         if ( day <= 22 && day >=1 ) {
            System.out.println("The astrological sign for " + month + " " + day + " is Leo");
         }
         else if (day >= 23 && day <= 31) {
            System.out.println("The astrological sign for " + month + " " + day + " is Virgo");
         }         
      }
      
      //9th month
      if ( month == 9 ) {
         if ( day <= 22 && day >=1 ) {
            System.out.println("The astrological sign for " + month + " " + day + " is Virgo");
         }
         else if (day >= 23 && day <= 31) {
            System.out.println("The astrological sign for " + month + " " + day + " is Libra");
         }         
      }
      
      //10th month
      if ( month == 10 ) {
         if ( day <= 22 && day >=1 ) {
            System.out.println("The astrological sign for " + month + " " + day + " is Libra");
         }
         else if (day >= 23 && day <= 31) {
            System.out.println("The astrological sign for " + month + " " + day + " is Scorpio");
         }         
      }
      
      //11th month
      if ( month == 11 ) {
         if ( day <= 21 && day >=1 ) {
            System.out.println("The astrological sign for " + month + " " + day + " is Scorpio");
         }
         else if (day >= 22 && day <= 31) {
            System.out.println("The astrological sign for " + month + " " + day + " is Sagittarius");
         }         
      }
      
      //12th month
      if ( month == 12 ) {
         if ( day <= 21 && day >=1 ) {
            System.out.println("The astrological sign for " + month + " " + day + " is Sagittarius");
         }
         else if (day >= 22 && day <= 31) {
            System.out.println("The astrological sign for " + month + " " + day + " is Capricorn");
         }         
      }
   }   
}
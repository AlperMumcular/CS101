import java.util.Scanner;

/**
 * time difference calculator
 * @author Alper Mumcular
 * @version 21.02.2020
 */ 
public class Lab02d
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // constants
      String FIRST_TIME = "Please enter the first time: ";
      String SECOND_TIME = "Please enter the second time: ";
      int HOUR_DENOMINATOR = 100;
      int MINUTE_CONVERTER = 60;
      // variables
      int firstHour;
      int secondHour;
      int hour;
      int minute;
      int minuteHelper1;
      int minuteHelper2;
      // program code
      System.out.print(FIRST_TIME);
      firstHour = scan.nextInt();
      System.out.print(SECOND_TIME);
      secondHour = scan.nextInt();
      hour = (secondHour - firstHour) / HOUR_DENOMINATOR;
      //set minute
      minuteHelper1 = firstHour % HOUR_DENOMINATOR;
      minuteHelper2 = secondHour % HOUR_DENOMINATOR;   
      minute = (minuteHelper2 - minuteHelper1 + MINUTE_CONVERTER) % MINUTE_CONVERTER;
      //print the result
      System.out.println(hour + " Hours " + minute + " Minutes");
   }

}
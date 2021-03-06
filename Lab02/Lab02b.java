import java.util.Scanner;

/**
 * Lesson Scheduler
 * @author Alper Mumcular
 * @version 21.02.2020
 */ 
public class Lab02b
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      // constants
      String HOUR = "Hour";
      String MONDAY = "Monday";
      String TUESDAY = "Tuesday";
      String HOUR1 = "8:40";
      String HOUR2 = "9:40";
      String HOUR3 = "10:40";
      String HOUR4 = "11:40";
      char VERTICAL_LINE = '|';
      char NO_LECTURE = '-';
      // variables
      int id;
      String fullName;
      String course1Name;
      String course2Name;
      String course3Name;
      String course4Name;
      //first program code and getting input
      System.out.println("Student Information");
      System.out.print("Enter ID: ");
      id = scan.nextInt();
      scan.nextLine();
      System.out.print("Enter full name: ");
      fullName = scan.nextLine();
      System.out.print("Enter the first course: ");
      course1Name = scan.next();
      System.out.print("Enter the second course: ");                   
      course2Name = scan.next();
      System.out.print("Enter the third course: ");                   
      course3Name = scan.next();
      System.out.print("Enter the fourth course: ");                   
      course4Name = scan.next();
      System.out.println("The student is " + '"' + fullName + '"' + ". His/her ID is " + id);
      System.out.println("Schedule");
      System.out.printf("\t%c %s\t%c %s\t%c %s\t%c" , VERTICAL_LINE, HOUR, VERTICAL_LINE , MONDAY, VERTICAL_LINE, TUESDAY, VERTICAL_LINE);
      System.out.println();
      System.out.printf("\t%c %s\t%c%s\t%c%s\t%c" , VERTICAL_LINE, HOUR1, VERTICAL_LINE , course1Name, VERTICAL_LINE, course3Name, VERTICAL_LINE);
      System.out.println();
      System.out.printf("\t%c %s\t%c%s\t%c %s\t%c" , VERTICAL_LINE, HOUR2, VERTICAL_LINE , course1Name, VERTICAL_LINE, NO_LECTURE, VERTICAL_LINE);
      System.out.println();
      System.out.printf("\t%c%s\t%c %s\t%c%s\t%c" , VERTICAL_LINE, HOUR3, VERTICAL_LINE , NO_LECTURE, VERTICAL_LINE, course4Name, VERTICAL_LINE);
      System.out.println();
      System.out.printf("\t%c%s\t%c%s\t%c %s\t%c" , VERTICAL_LINE, HOUR4, VERTICAL_LINE , course2Name, VERTICAL_LINE, NO_LECTURE, VERTICAL_LINE);   
      System.out.println();
   }
}
import java.util.Scanner;

/**
 * Does it form a triangle?
 * @author Alper Mumcular
 * @version 05.03.2020
 */ 
public class Lab03d
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
            
      // variables
      int a;
      int b;
      int c;
      boolean minValue;
      boolean maxValue;
      boolean positiveNumbers;
      boolean equilateral;
      boolean isosceles1;
      boolean isosceles2;
      boolean isosceles3;
      int triangleMin;
      int triangleMax;
            
      // program code
      System.out.print("Please enter the side lengths: ");
      a = scan.nextInt();
      b = scan.nextInt();
      c = scan.nextInt();
      positiveNumbers = (a > 0) && (b > 0) && (c > 0);
      
      //check numbers (are they positive)
      if (!positiveNumbers) {
         System.out.println("Side lengths: " + a + " " + b + " " + c);
         System.out.println("The side lengths must be positive.");
      }
      
      //triangle conditions
      triangleMin = Math.abs(a - b);
      triangleMax = Math.abs(a + b);
      
      //boolean values
      minValue = triangleMin < c;
      maxValue = triangleMax > c;
      equilateral = (a == b) && (b == c);
      isosceles1 = (a == b) && (a != c);
      isosceles2 = (a == c) && (a != b);
      isosceles3 = (b == c) && (a != b);
      
      //check if it forms a triangle
      if ((!minValue || !maxValue) && positiveNumbers) {
         System.out.println("Side lengths: " + a + " " + b + " " + c);
         System.out.println("The numbers do not form a triangle.");                  
      }
      else if ((minValue && maxValue) && positiveNumbers) {
         if(equilateral) {
            System.out.println("Side lengths: " + a + " " + b + " " + c);
            System.out.println("The numbers form a EQUILATERAL triangle.");
         }
         else if(isosceles1) {
            System.out.println("Side lengths: " + a + " " + b + " " + c);
            System.out.println("The numbers form a ISOSCELES triangle.");
         }
         else if (isosceles2) {
            System.out.println("Side lengths: " + a + " " + b + " " + c);
            System.out.println("The numbers form a ISOSCELES triangle."); 
         }
         else if (isosceles3) {
            System.out.println("Side lengths: " + a + " " + b + " " + c);
            System.out.println("The numbers form a ISOSCELES triangle."); 
         }
         else {
            System.out.println("Side lengths: " + a + " " + b + " " + c);
            System.out.println("The numbers form a SCALENE triangle."); 
         }
      }                  
   }   
}
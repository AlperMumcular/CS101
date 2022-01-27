import java.util.Scanner;

/**
 * Rectangular pattern creator
 * @author Alper Mumcular
 * @version 26.03.2020
 */ 
public class Lab05c
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // variables
      int width, height, thickness, w, h, count, mistake;
      String yes;
      
      // program code
      do{
         mistake = 0;
         do { // validate the inputs are positive
            System.out.print("Enter a width, height & thickness: ");
            width = scan.nextInt();
            height = scan.nextInt();
            thickness = scan.nextInt();
            if(width <= 0 || height <= 0 || thickness <= 0) {
               System.out.println("Error: all values must be positive!");
               mistake++;
            }
         } while (width <= 0 && height <= 0 && thickness <= 0);
         
         for (count = 0, h = 1; h <= height && mistake == 0; h++) { // loop for rectangular pattern
            for (w = 1; w <= width; w++) {
               if ((w <= thickness || w > width - thickness) || (h <= thickness || h > height - thickness)) {
                  System.out.print("*");
                  count++;
               }
               else {
                  System.out.print(" ");
               }
            }
            System.out.println();
            if (count == height * width) {
               System.out.println("\nOops... no hole!");
            }
         }          
         
         System.out.print("Enter Y or y to continue : "); // if the user want to continue
         yes = scan.next();
      } while (yes.equalsIgnoreCase("y"));
      System.out.println("goodbye");
   }
}
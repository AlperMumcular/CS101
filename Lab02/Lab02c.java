import java.util.Scanner;
import java.util.Locale;
/**
 * Volume finder of a triangular prism 
 * @author Alper Mumcular
 * @version 21.02.2020
 */ 
public class Lab02c
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      scan.useLocale(Locale.US);
      // variables
      double a;
      double b;
      double c;
      double l;
      double s;
      double area;
      double volume;
      // program code
      System.out.println("We will find the volume of a triangular prism");
      System.out.print("Enter triangle sides a, b, and c: ");
      a = scan.nextDouble();
      b = scan.nextDouble();
      c = scan.nextDouble();
      s = (a + b + c) / 2 ;
      area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
      System.out.print("Enter prism length: ");
      l = scan.nextDouble();
      volume = area * l;
      System.out.println("The sides of the triangle are " + a +", " + b + " and " + c);
      System.out.println("The length of the triangular prism is " + l);
      System.out.printf("The area of base triangle of the prism with respect to given parameters is " + "%.2f", area);
      System.out.println();
      System.out.printf("The volume of the prism with respect to given parameters is " + "%.3f", volume);
      System.out.println();
   }
}
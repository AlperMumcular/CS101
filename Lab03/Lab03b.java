import java.util.Scanner;
/**
 * Underfat healthy or overweight?
 * @author Alper Mumcular
 * @version 05.03.2020
 */ 
public class Lab03b
{

   public static void main (String [] a ) 
   {
      Scanner scan = new Scanner( System.in );
      //constants
      String UNDER_FAT;
      String HEALTHY;
      String OVER_WEIGHT;
      String OBESE;   
      
      //variables
      int age;
      double height;
      int weight;
      double bodyMassIndex;
      double bodyFatPercentage;
      
      //program code
      UNDER_FAT = "UNDERFAT";
      HEALTHY = "HEALTHY";
      OVER_WEIGHT = "OVERWEIGHT";
      OBESE = "OBESE";
      
      //getting values
      System.out.print("Please enter age: ");
      age = scan.nextInt();
      System.out.print("Please enter weight: ");
      weight = scan.nextInt();
      System.out.print("Please enter height: ");
      height = scan.nextDouble();
      
      //formula of BMI and BFP
      bodyMassIndex = weight / (height * height);
      bodyFatPercentage = (1.20 * bodyMassIndex) + (0.23 * age) - 16.2;
      
      //if your age between [18-40]
      if ( age >= 18 && age <= 40 ) {
         if ( bodyFatPercentage < 21 ) {
            System.out.printf("Based on a height of %.2f and weight of %d and age of %d, and your BFP is %.2f\n", height, weight, age, bodyFatPercentage);
            System.out.println("--> " + UNDER_FAT);
         }
         else if ( bodyFatPercentage >= 21 && bodyFatPercentage < 33 ) {
            System.out.printf("Based on a height of %.2f and weight of %d and age of %d, and your BFP is %.2f\n", height, weight, age, bodyFatPercentage) ;
            System.out.println("--> " + HEALTHY);            
         }
         else if ( bodyFatPercentage >= 33 && bodyFatPercentage <= 39 ) {
            System.out.printf("Based on a height of %.2f and weight of %d and age of %d, and your BFP is %.2f\n", height, weight, age, bodyFatPercentage) ;
            System.out.println("--> " + OVER_WEIGHT);  
         }
         else if ( bodyFatPercentage > 39 ) {
            System.out.printf("Based on a height of %.2f and weight of %d and age of %d, and your BFP is %.2f\n", height, weight, age, bodyFatPercentage) ;
            System.out.println("--> " + OBESE); 
         }
      }
      
      //if your age between [41-60]
      if ( age >= 41 && age <= 60 ) {
         if ( bodyFatPercentage < 23 ) {
            System.out.printf("Based on a height of %.2f and weight of %d and age of %d, and your BFP is %.2f\n", height, weight, age, bodyFatPercentage) ;
            System.out.println("--> " + UNDER_FAT);
         }
         else if ( bodyFatPercentage >= 23 && bodyFatPercentage < 35 ) {
            System.out.printf("Based on a height of %.2f and weight of %d and age of %d, and your BFP is %.2f\n", height, weight, age, bodyFatPercentage) ;
            System.out.println("--> " + HEALTHY);            
         }
         else if ( bodyFatPercentage >= 35 && bodyFatPercentage <= 40 ) {
            System.out.printf("Based on a height of %.2f and weight of %d and age of %d, and your BFP is %.2f\n", height, weight, age, bodyFatPercentage) ;
            System.out.println("--> " + OVER_WEIGHT);  
         }
         else if ( bodyFatPercentage > 40 ) {
            System.out.printf("Based on a height of %.2f and weight of %d and age of %d, and your BFP is %.2f\n", height, weight, age, bodyFatPercentage) ;
            System.out.println("--> " + OBESE); 
         }
      }
      
      //if your age between [61-79]
      if ( age >= 61 && age <= 79 ) {
         if ( bodyFatPercentage < 24 ) {
            System.out.printf("Based on a height of %.2f and weight of %d and age of %d, and your BFP is %.2f\n", height, weight, age, bodyFatPercentage) ;
            System.out.println("--> " + UNDER_FAT);
         }
         else if ( bodyFatPercentage >= 24 && bodyFatPercentage < 36 ) {
            System.out.printf("Based on a height of %.2f and weight of %d and age of %d, and your BFP is %.2f\n", height, weight, age, bodyFatPercentage) ;
            System.out.println("--> " + HEALTHY);           
         }
         else if ( bodyFatPercentage >= 36 && bodyFatPercentage <= 42 ) {
            System.out.printf("Based on a height of %.2f and weight of %d and age of %d, and your BFP is %.2f\n", height, weight, age, bodyFatPercentage) ;
            System.out.println("--> " + OVER_WEIGHT);  
         }
         else if ( bodyFatPercentage > 42 ) {
            System.out.printf("Based on a height of %.2f and weight of %d and age of %d, and your BFP is %.2f\n", height, weight, age, bodyFatPercentage) ;
            System.out.println("--> " + OBESE); 
         }
      }                              
   }
}
   
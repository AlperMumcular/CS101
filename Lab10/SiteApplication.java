import java.util.Scanner;
import java.util.ArrayList;

/**
 * Apartment simulator
 * @author Alper Mumcular
 * @version 14.05.2020
 */ 
public class SiteApplication
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // variables
      String siteName;
      Site s1;
      int choice;
      String ownerName;
      String address;
      int residents;
      double serviceCharge;
      double min;
      double max;
      ArrayList<House> houses;
      
      // program code
      System.out.print( "Enter name of site: " );
      siteName = scan.nextLine();
      s1 = new Site( siteName );
      do {
         System.out.print( "1-Add House\n2-View Houses\n3-Search Houses by Fee\n4-Exit\nEnter Choice: " );
         choice = scan.nextInt();
         scan.nextLine();
         if( choice == 1 ) {
            System.out.print( "Enter Owner Name: " );
            ownerName = scan.nextLine();
            System.out.print( "Enter address: " );
            address = scan.nextLine();
            System.out.print( "Enter number of residents: " );
            residents = scan.nextInt();
            System.out.print( "Enter service charge: " );
            serviceCharge = scan.nextDouble();
            if( s1.addHouse( ownerName, address, residents, serviceCharge ) )  
                  System.out.println( "House Successfully added to Site.\n" );
         }
         
         else if( choice == 2 ) {
            System.out.println( "\nList of Houses in " + siteName + "\n------------------------" );
            s1.viewHouses();
         }
         
         else if( choice == 3 ) {
            System.out.print( "\nEnter minimum and maximum fee: " );
            min = scan.nextDouble();
            max = scan.nextDouble();
            System.out.printf( "\nHouses on Site with fee between %.2f and %.2f TL:\n", min, max );
            houses = s1.searchHouseByFee( min, max );
            for( int i = 0; i < houses.size(); i++ )
               System.out.println( houses.get(i) + "\n" );
         }
         
         else if( choice >= 5 || choice <= 0 )
            System.out.println( "Invalid choice\n" );
         
      } while( choice != 4 );
   }

}
import java.util.ArrayList;
/**
 * Represents the apartments
 */
public class Site 
{
   // constants
   public static final int MAX_HOUSES = 10; 
   
   // properties
   private House[] houseList;
   private int houseCount;
   private String siteName;
   private int residents;
   
   // constructors
   public Site( String s ) {
      this.houseList = new House[MAX_HOUSES];
      this.siteName = setSiteName( s );
      this.residents = 0;
      this.houseCount = 0;
   }
   
   private String setSiteName( String s ) {
      this.siteName = s;
      return this.siteName;
   }
   
   // methods
   /**
    * adds houses to the site if there are available place
    * @param o --> owner name, a --> address, r --> residents, s --> service fee
    * @return boolean result
    */
   public boolean addHouse( String o, String a, int r, double s ) {
      for( int i = 0; i < 10; i++) {
         if( this.houseList[i] == null ) {
            this.houseList[i] = new House( o, a, r, s );
            this.houseCount++;
            return true;
         }
      }
      return false;
   }
   
   /**
    * updates the total residents of the site object
    * 
    * @return total residents
    */
   public int updateTotalResidents() {
      for( int i = 0; i < 10; i++ ) {
         if( this.houseList[i] != null ) {
            this.residents += this.houseList[i].getResidents();
         }
      }
      return this.residents;
   }
   
   /**
    * views the houses in the site object 
    */
   public void viewHouses() {
      int residents;
      residents = 0;
      for( int i = 0; i < MAX_HOUSES; i++ ) {
         if( this.houseList[i] != null ) {
            residents += this.houseList[i].getResidents();
            System.out.println( "\n" + this.houseList[i] );
         }
      }
      System.out.println( "Total Residents on Site: " + residents + "\n");
   }
   
   /**
    * searches houses by total service fee 
    * @param min --> minimum value, max --> maximum value
    * @return ArrayList of the houses between min and max value
    */
   public ArrayList<House> searchHouseByFee( double min, double max ) {
      ArrayList<House> houses = new ArrayList<House>();
      for( int i = 0; i < MAX_HOUSES; i++ ) {
         if(this.houseList[i] != null ) {
            if( this.houseList[i].calculateTotalServiceFee() >= min && this.houseList[i].calculateTotalServiceFee() <= max )
               houses.add( this.houseList[i] ); 
         }
      }
      return houses;
   }
}
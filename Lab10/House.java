/**
 * Represents the houses
 */
public class House 
{
   // properties
   private String ownerName;
   private String address;
   private int residents;  
   private double serviceChargePerResident;
      
   // constructors
   public House( String o, String a, int r, double s ) {
      this.ownerName = setOwnerName( o );
      this.address = setAddress( a );
      this.residents = setResidents( r );
      this.serviceChargePerResident = setServiceChargePerResident( s );
   }
   
   // getters
   public String getOwnerName() {
      return this.ownerName;
   }
   
   public String getAddress() {
      return this.address;
   }
   
   public int getResidents() {
      return this.residents;
   }
   
   public double getServiceChargePerResident() {
      return this.serviceChargePerResident;
   }
   
   // setters 
   private String setOwnerName( String o ) {
      this.ownerName = o;
      return this.ownerName;
   }
   
   private String setAddress( String a ) {
      this.address = a;
      return this.address;
   }
   
   private int setResidents( int r ) {
      this.residents = r;
      return this.residents;
   }
   
   private double setServiceChargePerResident( double s ) {
      this.serviceChargePerResident = s;
      return this.serviceChargePerResident;
   }
   
   // methods
   /**
    * Calculates total service fee of the house object
    * 
    * @return total service fee
    */
   public double calculateTotalServiceFee() {
      return this.residents * this.serviceChargePerResident;
   } 
   
   /**
    * String representation of the house object
    * 
    * @return String result of the object
    */
   @Override
   public String toString() {
      return "Owner: " + this.ownerName + "\n" + this.address + "\nResidents: " + this.residents
         + " Monthly Fee: (" + calculateTotalServiceFee() + " TL)";
   }
}
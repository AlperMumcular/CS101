/**
 * A simple Java class!
 */
public class Mechanic 
{
   // properties
   public static int mechanicCounter = 10;

   // private properties
   private String mechanicID;
   private int xCoordinate;
   private int yCoordinate;
   
   // constructors
   public Mechanic() {
      this.mechanicID = setMechanicID();
      this.xCoordinate = setxCoordinate( 0 );
      this.yCoordinate = setyCoordinate( 0 );
   }
   
   // accessor methods
   public String getMechanicID() {
      return this.mechanicID;
   }
   
   public int getxCoordinate() {
      return this.xCoordinate;
   }
   
   public int getyCoordinate() {
      return this.yCoordinate;
   }

   // set methods
   /*
    * gives id to mechanic
    * @param
    * @return id of the mechanic
    * */
   public String setMechanicID() {
      mechanicID = "Mechanic-" + mechanicCounter;
      mechanicCounter++;
      return this.mechanicID;
   }
   
   public int setxCoordinate( int x ) {
      this.xCoordinate = x;
      return this.xCoordinate;
   }
   
   public int setyCoordinate( int y ) {
      this.yCoordinate = y;
      return this.yCoordinate;
   }
   
   // other methods 
   
   /*
    * teleports the mechanic next to the robot which calls the mechanic
    * @param  x, y --> coordinates of the robot that calls mech
    * */
   public void teleportation( int x, int y ) {
      if (!(Math.abs( x ) > 10) || !(Math.abs( y ) > 10)) {
         xCoordinate = x;
         yCoordinate = x;
      }
   }
   
   /*
    * fixes the robot
    * @param robot --> the robot which must be repaired 
    * */
   public void fixRobot( ScoutRobot robot) {
      if ( !robot.getCondition() ) {
         teleportation ( robot.getxCoordinate(), robot.getyCoordinate() );
         robot.resetBattery();
         System.out.print( "The Robot has been fixed. " );
         robot.getCondition();
         teleportation ( 0, 0);
         System.out.println( "I have returned to the base." );
         System.out.println(robot + "\n");
      }
   }
   /*
    * represents any Mechanic object as a string
    * @return string representation of the object
    * */
   @Override
   public String toString() {
      return "Mechanic{mechanicID='" + mechanicID + "', xCoordinate=" + xCoordinate + ", yCoordinate=" + 
         yCoordinate + "}";
   }
}
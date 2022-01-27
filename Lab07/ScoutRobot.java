/**
 * Auto Generated Java Class.
 */
public class ScoutRobot {
   
   // constants
   public static final int VELOCITY = 2;
   public static final int CONSUMED_ENERGY_PER_UNIT = 5;
   
   // properties 
   public static int scoutCounter = 100;
   
   // private properties -- instance variables
   private String robotID;
   private int xCoordinate;
   private int yCoordinate;
   private int direction;
   private double maxBattery;
   private double batteryLeft;
   private boolean condition;
   
   // constructors
   public ScoutRobot( int xCoordinate, int yCoordinate, double maxBattery ) {
      robotID = setRobotID();
      this.xCoordinate = setxCoordinate( xCoordinate );
      this.yCoordinate = setyCoordinate( yCoordinate );
      this.maxBattery = setMaxBattery( maxBattery );
      this.batteryLeft = setBatteryLeft( maxBattery );
   }
   
   // accessor methods
   public String getRobotID () {
      return this.robotID;
   }
   
   public int getxCoordinate() {
      return this.xCoordinate;
   }
   
   public int getyCoordinate() {
      return this.yCoordinate;
   }
   
   public int direction() {
      return this.direction;
   }
   
   public boolean getCondition() {
      return this.condition;
   }
   
   public double getBatteryLeft() {
      return this.batteryLeft;
   }
   
   public double getMaxBattery() {
      return this.maxBattery;
   }
   
   
   // set methods
   private String setRobotID () {
      robotID = "Scout-" + scoutCounter;
      scoutCounter++;
      return this.robotID;
   }
   
   public int setxCoordinate( int x ) {
      this.xCoordinate = x;
      return this.xCoordinate;
   }
   
   public int setyCoordinate( int y ) {
      this.yCoordinate = y;
      return this.yCoordinate;
   }
   
   /*
    * finds the direction of the robot
    * @param x, y --> coordinates of the robot after moving
    * @return direction of the robot
    * */
   public int setDirection(int x, int y) {
      if ( x - xCoordinate > 0 ) 
         direction = 3;         
      else if ( x - xCoordinate < 0)
         direction = 1;          
      else if (y - yCoordinate > 0)
         direction = 2;  
      else if (y - yCoordinate < 0) 
         direction = 0;      
      return direction;
   }
   
   public double setMaxBattery( double fuel ) {
      this.maxBattery = fuel;
      return this.maxBattery;
   }
   
   public double setBatteryLeft( double fuel ) {
      this.batteryLeft = fuel;
      return this.batteryLeft;
   }
   
   /*
    * checks the robot condition
    * @param x and y are the coordinates of the point to discover 
    * @return condition of the robot
    */
   private boolean setCondition ( int x, int y ) {
      if ( (xCoordinate == 0 && x == 0) || (yCoordinate == 0 && y == 0)) {
         condition = ( Math.abs( x - xCoordinate ) + Math.abs( y - yCoordinate ) + 2 ) * 5 <= batteryLeft;
         if( !condition ) {
            condition = ( Math.abs( x - xCoordinate ) + Math.abs( y - yCoordinate ) ) * 5 <= batteryLeft;
         }
      }
      else {
         condition = ( Math.abs( x - xCoordinate ) + Math.abs( y - yCoordinate ) ) * 5 <= batteryLeft;
      }
      return condition;
   }
   
   
   // other methods
   
   /*
    * checks coordinates of points and moves the robot if robot have enough battery
    * @param x and y are the coordinates of the point to discover
    * @return boolean result of robot's endurance to go the point
    */
   public boolean goToLocation( int x, int y ) {
      if (Math.abs( x ) > 10 || Math.abs( y ) > 10) 
         return false;
      else {
         double unit = 0;
         if (!setCondition(x, y)) {
            System.out.println("There is no enough battery. \n");
            Mechanic mech1 = new Mechanic();
            callMechanic ( mech1 );
         }
         System.out.println("Starting from (" + xCoordinate + ", " + yCoordinate + ")");
            if (yCoordinate == 0 && y == 0) {
               yCoordinate++;
               unit++;
               batteryLeft = batteryLeft - CONSUMED_ENERGY_PER_UNIT;
               System.out.println("1 unit(s) on Direction 0 --> (" + xCoordinate + ", " + yCoordinate + ")");
            }
            else if (xCoordinate == 0 && x ==0) {
               xCoordinate++;
               unit++;
               batteryLeft = batteryLeft - CONSUMED_ENERGY_PER_UNIT;
               System.out.println("1 unit(s) on Direction 1 --> (" + xCoordinate + ", " + yCoordinate + ")");
            }
            int storeX = xCoordinate;
            int storeY = yCoordinate;
            double storeUnit = unit;
            double storeBattery = batteryLeft;
            while (Math.abs(x - xCoordinate) > 0) {
               if (x - xCoordinate > 0) {
                  xCoordinate++;
                  unit++;
                  batteryLeft = batteryLeft - CONSUMED_ENERGY_PER_UNIT;
               }
               else if (x - xCoordinate < 0) {
                  xCoordinate--;
                  unit++;
                  batteryLeft = batteryLeft - CONSUMED_ENERGY_PER_UNIT;
               }
            }
            if (xCoordinate == 0 && yCoordinate * y <= 0) {
                  xCoordinate = storeX;
                  unit = storeUnit;
                  batteryLeft = storeBattery;
            }
            if(xCoordinate == x) {
               System.out.println( (int) (unit - storeUnit) + " unit(s) on Direction " + setDirection(storeX, yCoordinate) + 
                                  " --> (" + xCoordinate + ", " + yCoordinate + ")");
            }
            storeY = yCoordinate;
            storeUnit = unit;
            storeBattery = batteryLeft;
            while (Math.abs(y - yCoordinate) > 0) {
               if (y - yCoordinate > 0) {
                  yCoordinate++;
                  unit++;
                  batteryLeft = batteryLeft - CONSUMED_ENERGY_PER_UNIT;
               }
               else if (y - yCoordinate < 0) {
                  yCoordinate--;
                  unit++;
                  batteryLeft = batteryLeft - CONSUMED_ENERGY_PER_UNIT;
               }
               if (xCoordinate == 0 && yCoordinate == 0) {
                  yCoordinate = storeY;
                  unit = storeUnit;
                  batteryLeft = storeBattery;
                  continue;
               }
            }
            if(y == yCoordinate) {
               System.out.println( (int) (unit - storeUnit) + " unit(s) on Direction " + setDirection(xCoordinate, storeY) + 
                                  " --> (" + xCoordinate + ", " + yCoordinate + ")");
            }
            
            if(x != xCoordinate || y != yCoordinate) {
               storeX = xCoordinate;
               storeY = yCoordinate;
               storeUnit = unit;
               storeBattery = batteryLeft;
               while (Math.abs(x - xCoordinate) > 0) {
                  if (x - xCoordinate > 0) {
                     xCoordinate++;
                     unit++;
                     batteryLeft = batteryLeft - CONSUMED_ENERGY_PER_UNIT; 
                  }
                  else if (x - xCoordinate < 0) {
                     xCoordinate--;
                     unit++;
                     batteryLeft = batteryLeft - CONSUMED_ENERGY_PER_UNIT;
                  }
                  if (xCoordinate == 0 && yCoordinate == 0) {
                     xCoordinate = storeX;
                     unit = storeUnit;
                     batteryLeft = storeBattery;
                     continue;
                  }
               }
               if(x == xCoordinate) {
                  System.out.println( (int) (unit - storeUnit) + " unit(s) on Direction " + setDirection(storeX, yCoordinate) + 
                                     " --> (" + xCoordinate + ", " + yCoordinate + ")");
               }
            }
            System.out.println("This move took " + (unit / VELOCITY) + " time unit(s). The battery left is " + batteryLeft + "/" + maxBattery + "\n");
            return true;
         
      }
   }
   
   /*
    * calls the mechanic
    * @param mech --> the mechanic which will repair the robot 
    */
   public void callMechanic ( Mechanic mech ) {
      System.out.println( "A mechanic has been summoned." );
      mech.fixRobot(this);
   }
   
   /*
    * represents any ScoutRobot object as a string
    * @return string representation of the object
    * */
   @Override
   public String toString() {
      return "ScoutRobot{robotID='" + robotID + "', xCoordinate=" + xCoordinate + ", yCoordinate=" + 
         yCoordinate + ", direction=" + direction + ", batteryLeft=" + batteryLeft + "}";
   }
   
   /*
    * Compares the distances of two robots to the base
    * @param other --> another robot which is going to be compared
    * @return a integer to understand which is closer to the base
    * */
   public int compareRobots( ScoutRobot other ) {
      if ( distance( xCoordinate, yCoordinate ) < other.distance( other.getxCoordinate(), other.getyCoordinate() ) )
         return 1;
      else if ( distance( xCoordinate, yCoordinate ) == other.distance( other.getxCoordinate(), other.getyCoordinate() ) )
         return 0;
      else
         return -1;
   }
   
   /*
    * calculates the distance of the point to the base
    * @param x and y are the coordinates of the point
    * @return distance without square root
    * */
   public int distance( int x, int y ) {
      int distance;
      distance = x*x + y*y;
      return distance;
   }
   
   /*
    * charges the battery
    * @return remaining battery
    * */
   public double resetBattery() {
      batteryLeft = maxBattery;
      return batteryLeft;
   }
}

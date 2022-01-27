/**
 * Application for Robots
 * @author Alper Mumcular 
 * @version 16.04.2020
 */ 
public class RobotApp
{
   public static void main( String[] args )
   {  
      // variables
      ScoutRobot robot1 = new ScoutRobot(0, 0, 100);
      ScoutRobot robot2 = new ScoutRobot(0, 0, 100);
      Mechanic mech1 = new Mechanic();

      // program code
      System.out.println( robot1 + "\n");
      System.out.println( robot2 + "\n");
      System.out.println( mech1 + "\n");
      
      // First robot's travel
      System.out.println("----------------- " + robot1.getRobotID() + "----------------- ");
      robot1.goToLocation( 2, 3 );         
      robot1.goToLocation( -2, 0 );
      robot1.goToLocation( 3, 0 );
      robot1.goToLocation( 0, 5 );
      
      
      // Second robot's travel
      System.out.println("----------------- " + robot2.getRobotID() + "----------------- ");
      robot2.goToLocation( 3, -4 );
      robot2.goToLocation( 0, 3 );     
      robot2.goToLocation( 0, -4 );
      robot2.goToLocation( 1, 2 );
      
      // compare distances to origin
      System.out.println("-------------------------------------------");
      if (robot1.compareRobots( robot2 ) == 1)
         System.out.println(robot1.getRobotID() + " is closer to the base than " + robot2.getRobotID());
      else if (robot1.compareRobots( robot2 ) == -1)
         System.out.println(robot2.getRobotID() + " is closer to the base than " + robot1.getRobotID());
      else if (robot1.compareRobots( robot2 ) == 0)
         System.out.println(robot1.getRobotID() + " is equal to the base than " + robot2.getRobotID());
   }

}
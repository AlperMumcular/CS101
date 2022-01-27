/**
 * RationalNumber calculations 
 * @author Alper Mumcular
 * @version 15.05.2020
 */ 
public class TestRationalNumber
{
   public static void main( String[] args )
   {
      // variables
      RationalNumber x;
      RationalNumber y;
      RationalNumber result;
      
      // program code
      x = new RationalNumber( 7, 20 );
      y = new RationalNumber( 8, -30 );
      
      // using isLessThan() and equals() method on RationalNumber 
      System.out.println( "Is " + x + " less than " + y + "\t\t ---> " + x.isLessThan( y ) );
      System.out.println( "Is " + x + " equal to " + y + "\t\t ---> " + x.equals( y ));
      
      // testing add(), isZero(), isInteger() methods
      result = x.add( y );
      System.out.println( x + " + " + y + " = " + result + "\t\t is " + result + " zero?: " 
                            + result.isZero() + "\t is " + result + " integer?: " + result.isInteger() );
      
      // testing substract(), isZero(), isInteger() methods
      result = x.substract( y );
      System.out.println( x + " - " + y + " = " + result + "\t\t is " + result + " zero?: " 
                            + result.isZero() + "\t is " + result + " integer?: " + result.isInteger() );
      
      // testing multiply(), isZero(), isInteger() methods
      result = x.multiply( y );
      System.out.println( x + " x " + y + " = " + result + "\t\t is " + result + " zero?: " 
                            + result.isZero() + "\t is " + result + " integer?: " + result.isInteger() );
      
      // testing divide(), isZero(), isInteger() methods
      result = x.divide( y );
      System.out.println( x + " / " + y + " = " + result + "\t\t is " + result + " zero?: " 
                            + result.isZero() + "\t is " + result + " integer?: " + result.isInteger() );
      
      // testing reciprocate(), isZero(), isInteger() methods
      result = x.reciprocate();
      System.out.println( "Reciprocal of " + x + " = " + result + "\t is " + result + " zero?: " 
                            + result.isZero() + "\t is " + result + " integer?: " + result.isInteger() );
   }

}
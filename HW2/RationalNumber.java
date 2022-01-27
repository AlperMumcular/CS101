/**
 * RationalNumber class
 * @author Alper Mumcular
 * @version 15.05.2020
 */
public class RationalNumber 
{
   // properties
   private int numerator;
   private int denominator;
   private int gcd;
   private double value;
   
   // constructor
   public RationalNumber( int n, int d ) {
      this.value = setValue( n, d );
      this.gcd = gcd( n, d );
      this.numerator = setN( n );
      this.denominator = setD( d );
   }
   
   // get methods
   public int getN() {
      return this.numerator;
   }
   
   public int getD() {
      return this.denominator;
   }
   
   public int getGCD() {
      return this.gcd;
   }
   
   public double getValue() {
      return this.value;
   }
   
   // set methods
   private int setN( int n ) {
      return n / gcd;
   }
   
   private int setD( int d ) {
      if( d < 0 ){
         this.numerator = -1 * this.numerator;
      }
      return Math.abs( d ) / gcd; 
   }
   
   private double setValue( int n, int d) {
      return (double) n / d;
   }
   
   // methods
   /**
    * finds the greatest common divisor  
    * @param n --> numerator, d --> denominator
    * @return greatest common divisor of numerator and denominator
    */
   private int gcd( int n, int d ) {
      int commonDivisor = 1;
      if ( d == 0 ) { // just for giving error if denominator is 0
         System.out.println( "denominator can not be 0. " );
         commonDivisor = n / d; // gives error to show that denominator can not be 0
      }
      for( int i = Math.max( Math.abs( n ), Math.abs( d ) ); commonDivisor == 1 && i >= 1; i-- ) { 
         if( Math.abs(n) % i == 0 && Math.abs(d) % i == 0 ) {
            commonDivisor = i;
         }
      }
      return commonDivisor;
   }
   
   /**
    * adds other RationalNumber to this  
    * @param other --> other RationalNumber object
    * @return new RationalNumber instance
    */
   public RationalNumber add( RationalNumber other ) {
      int numerator;
      int denominator;
      numerator = this.getN() * other.getD() + other.getN() * this.getD();
      denominator = this.getD() * other.getD();
      return new RationalNumber( numerator, denominator );
   }
   
   /**
    * substracts other RationalNumber from this  
    * @param other --> other RationalNumber object
    * @return new RationalNumber instance
    */
   public RationalNumber substract( RationalNumber other ) {
      int numerator;
      int denominator;
      numerator = this.getN() * other.getD() - other.getN() * this.getD();
      denominator = this.getD() * other.getD();
      return new RationalNumber( numerator, denominator );
   }
   
   /**
    * multiplies other RationalNumber with this  
    * @param other --> other RationalNumber object
    * @return new RationalNumber instance
    */
   public RationalNumber multiply( RationalNumber other ) {
      int numerator;
      int denominator;
      numerator = this.getN() * other.getN();
      denominator = this.getD() * other.getD();
      return new RationalNumber( numerator, denominator );
   }
   
   /**
    * divides this to other RationalNumber object  
    * @param other --> other RationalNumber object
    * @return new RationalNumber instance
    */
   public RationalNumber divide( RationalNumber other ) {
      int numerator;
      int denominator;
      numerator = this.getN() * other.getD();
      denominator = this.getD() * other.getN();
      return new RationalNumber( numerator, denominator );
   }
   
   /**
    * reciprocates this RationalNumber 
    * 
    * @return new RationalNumber instance
    */
   public RationalNumber reciprocate() {
      int numerator;
      int denominator;
      numerator = this.getD();
      denominator = this.getN();
      return new RationalNumber( numerator, denominator );
   }
   
   // instance methods
   /**
    * checks the RationalNumber if it is integer or not  
    * 
    * @return boolean result
    */
   public boolean isInteger() {
      if( Math.abs( this.getValue() ) % 1 == 0 ) 
         return true;
      else
         return false;
   }
   
   /**
    * checks the RationalNumber if it is zero or not  
    * 
    * @return boolean result
    */
   public boolean isZero() {
      if( this.numerator == 0 ) 
         return true;
      else 
         return false;
   }
   
   /**
    * checks this RationalNumber if it is less than other RationalNumber  
    * @param other --> other RationalNumber which is going to be compared
    * @return boolean result
    */
   public boolean isLessThan( RationalNumber other ) {
      if( this.getValue() < other.getValue() )
         return true;
      else
         return false;
   }
   
   /**
    * checks this RationalNumber if it is equal to other RationalNumber  
    * @param other --> other RationalNumber which is going to be compared
    * @return boolean result
    */
   public boolean equals( RationalNumber other ) {
      if( this.getValue() == other.getValue() )
         return true;
      else
         return false;
   }
   
   /**
    * String representation of RationalNumber object 
    * 
    * @return String representation
    */
   @Override
   public String toString() {
      return this.numerator + "/" + this.denominator;
   }
}
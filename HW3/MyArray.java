/**
 * MyArray class
 * @author Alper Mumcular
 * @version 22.05.2020
 */ 
public class MyArray 
{
   // constants 
   public static final int DEFAULT_LENGTH = 10;
   public static final int DEFAULT_VALUE = -1;
   
   // properties
   private int[] array;

   // default constructor
   public MyArray() {
      this.array = new int[DEFAULT_LENGTH];
      for( int n = 0; n < DEFAULT_LENGTH; n++ )
         this.array[n] = DEFAULT_VALUE;
   }
   
   /**
    * second constructor
    * @param length --> length of the array
    **/
   public MyArray( int length ) {
      this.array = new int[length];
      for( int n = 0; n < length; n++ )
         this.array[n] = (int) ( Math.random() * (length + 1) );
      if( length != 0 )
         System.out.println( "Random array has been created." );
   }
   
   // getter
   public int[] getArray() {
      return this.array;
   }

   // setter
   /**
    * Sets array
    * @param other --> other array
    * @return our instance data member "array"
    **/
   public void setArray( int[] other ) {
      if( other.length == 0 ) {
      }
      else {
         if( this.array.length != other.length )
            this.array = new int[other.length];
         this.array = other;
         System.out.println( "The array has been set." );
      }
   } 
   
   // methods
   /**
    * Finds the largest integer which has a frequency in the array equal to its value
    * @param 
    * @return the lucky number. If there is no lucky number return -1
    **/
   public int findLucky() {
      int count;
      count = 0;
      for( int n = this.array.length; n >= 0; n-- ) {
         for( int i = 0; i < this.array.length; i++ ) {
            if( n == this.array[i] ) 
               count++;
         }
         if( count == n )
            return n;
         count = 0;
      }
      return DEFAULT_VALUE;
   }
   
   /**
    * Splits the array and checks one side is equal to the sum of the numbers on the other side
    * @param 
    * @return new Balanced instance to give 2 values
    **/
   public Balanced isBalanced() {
      if( this.array.length % 2 == 1 )
         return new Balanced( false, -1 );
      else {
         int n;
         int sum;
         sum = 0;
         for( n = 0; n < this.array.length / 2; n++) {
            sum += this.array[n];
         }
         for( ; n < this.array.length; n++) {
            sum -= this.array[n];
         }
         if( sum == 0 ) {
            if( this.array.length == 0)
               return new Balanced( true, -1 );
            return new Balanced( true, this.array[this.array.length / 2 - 1] );
         }
         else
            return new Balanced( false, -1 );
      } 
   }
   
   /**
    * merges both arrays
    * @param other --> other array 
    * @return our instance data member "array" which is merged with other array
    **/
   public void merge( int[] other ) {
      int[] mergedArray;
      int i;
      String str;
      str = " [ ";
      for( int n = 0; n < other.length; n++ ) {
         if( n == other.length - 1 )
            str += other[n];
         else 
            str += other[n] + ", ";
      }
      str += " ]";
      mergedArray = new int[this.array.length + other.length];
      for( i = 0; i < this.array.length; i++) {
         mergedArray[i] = this.array[i];
      }
      for( int n = 0; i < mergedArray.length; i++, n++) {
         mergedArray[i] = other[n];
      }
      System.out.println( this );
      System.out.println( "array to be merged with: " + str );
      this.array = new int[mergedArray.length];
      this.array = mergedArray;
      System.out.println( "The arrays have been merged." );
      System.out.println( "Merged array: " + this + "\n" );
   }
   
   /**
    * changes the indices of values randomly
    * @param 
    * @return our instance data member "array" 
    **/
   public void randomize() {
      int[] randomized;
      int place;
      System.out.println( this );
      randomized = new int[this.array.length];
      for( int i = 0, n = this.array.length; i < this.array.length; i++, n--) {
         place = (int) (Math.random() * n);
         randomized[i] = this.array[place];
         this.array[place] = this.array[this.array.length - 1 - i];
      }
      this.array = randomized;
      System.out.println( "The array has been randomized." );
      System.out.println( this + "\n" );
   }
   
   /**
    * sorts our data member
    * @param 
    * @return our instance data member "array" as a sorted list
    **/
   public void sort() {
      int first;
      int second;
      int temp;
      System.out.println( this );
      for( int i = 0; i < this.array.length; i++) {
         for( first = 0, second = 1; second < this.array.length; first++, second++) {
            if( this.array[first] > this.array[second] ){
               temp = this.array[first];
               this.array[first] = this.array[second];
               this.array[second] = temp;
            }
         }
      }
      System.out.println( "The array has been sorted." );
      System.out.println( this + "\n" );
   }
   
   /**
    * String representation of MyArray object
    * @param
    * @return String representation of the object
    **/
   @Override
   public String toString() {
      String str;
      str = "Array: [ ";
      for( int i = 0; i < this.array.length - 1; i++ ) {
         str += this.array[i];
         str += ", ";
      }
      if( this.array.length != 0 )
         str += this.array[this.array.length - 1] + " ]";
      else
         str += " ]";
      return str;
   }
}
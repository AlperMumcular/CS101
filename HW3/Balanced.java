/**
 * Balanced class for getting 2 values from another class method
 * @author Alper Mumcular
 * @version 22.05.2020
 */ 
public class Balanced 
{
   // properties
   private boolean isBalanced;
   private int index;
   
   // constructors
   public Balanced( boolean isBalanced, int index ) {
      this.isBalanced = isBalanced;
      this.index = index; 
   } 
   
   // methods
   /**
    * Represents object as a string
    * @param
    * @return string representation of the object
    **/
   @Override
   public String toString() {
      if( this.isBalanced )
         return "The array is balanced and the last index of the first part is " 
                               + this.index + "\n";
      else
         return "The array is not balanced.\n";
   }
}
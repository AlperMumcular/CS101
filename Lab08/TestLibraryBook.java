/**
 * Tests LibraryBook class
 */
public class TestLibraryBook 
{
   public static void main( String [] args ){
   // variables
   LibraryBook b1 = new LibraryBook( "J.K. Rowling", "Harry Potter and Philosopher's Stone" );
   LibraryBook b2 = new LibraryBook( "Dostoyevski", "Notes From Underground" );
   LibraryBook b3;
   LibraryBook b4 = new LibraryBook( b2 );
   
   // program code
   b3 = b1;
   
   System.out.println( (b1 == b2) + "\t" + b1.equals( b2 ));
   System.out.println( (b1 == b3) + "\t" + b1.equals( b3 ));
   System.out.println( (b1 == b4) + "\t" + b1.equals( b4 ));
   System.out.println( (b2 == b3) + "\t" + b2.equals( b3 ));
   System.out.println( (b2 == b4) + "\t" + b2.equals( b4 ));
   System.out.println( (b3 == b4) + "\t" + b3.equals( b4 ));
   
   System.out.println(b1.getTimesLoaned());
   System.out.println(b1.onLoan());
   System.out.println(b1);
   

   }

}
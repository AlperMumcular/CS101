/**
 * represents a library
 */
public class Library 
{
   // properties
   private LibraryBook b1, b2, b3, b4;
   
   // constructors
   public Library() {
      this.b1 = null;
      this.b2 = null;
      this.b3 = null;
      this.b4 = null;  
   }
   
   // accessor methods
   public LibraryBook getB1() {
      return b1;
   }
   
   public LibraryBook getB2() {
      return b2;
   }
   
   public LibraryBook getB3() {
      return b3;
   }
   
   public LibraryBook getB4() {
      return b4;
   }
   
   // mutator methods
   private LibraryBook setB1( String author, String title ) {
      b1 = new LibraryBook( author, title);
      return b1;
   }
   
   private LibraryBook setB2( String author, String title ) {
      b2 = new LibraryBook( author, title);
      return b2;
   }
   
   private LibraryBook setB3( String author, String title ) {
      b3 = new LibraryBook( author, title);
      return b3;
   }
   
   private LibraryBook setB4( String author, String title ) {
      b4 = new LibraryBook( author, title);
      return b4;
   }
   
   // other methods
   
   /**
    * checks are there any books 
    * 
    * @return boolean result
    */
   public boolean isEmpty() {
      if( b1 == null && b2 == null && b3 == null && b4 == null )
         return true;
      else 
         return false;
   }
   
   /**
    * represents any Library object as a String
    * @return string result of the object
    */
   @Override
   public String toString() {
      if (isEmpty())
         return "Library is empty.";
      else { 
         String str;
         str = "";
         if( b1 != null )
            str += b1 + "\n";
         if( b2 != null )
            str += b2 + "\n";
         if( b3 != null )
            str += b3 + "\n";
         if( b4 != null )
            str += b4 + "\n";
         return str;
      } 
   }
   
   /**
    * adds book if the are available place
    * @param author, title --> Author and title of the book which is going to be added to library
    * @return boolean result
    */
   public boolean add( String author, String title ) {
      if ( b1 == null ) {
         b1 = new LibraryBook( setB1( author, title ) );
         return true;
      }
      else if ( b2 == null ) {
         b2 = new LibraryBook( setB2( author, title ) );
         return true;
      }
      else if ( b3 == null ) {
         b3 = new LibraryBook( setB3( author, title ) );
         return true;
      }
      else if ( b4 == null ) {
         b4 = new LibraryBook( setB4( author, title ) ); 
         return true; 
      }
      
      else 
         return false;
   }
   
   /**
    * removes book if this book is in the library
    * @param book --> which book wants to be removed from library
    * @return boolean result
    */
   public boolean remove( LibraryBook book ) {
      
      if( b1 != null && book.equals( b1 ) ) {
         b1 = null;
         return true;
      }
      else if( b2 != null && book.equals( b2 ) ) {
         b2 = null;
         return true;
      }
      else if( b3 != null && book.equals( b3 ) ) {
         b3 = null;
         return true;
      }
      else if( b4 != null && book.equals( b4 ) ) {
         b4 = null;
         return true; 
      }
      
      else
         return false;
   }
   
   /**
    * finds the book from its title
    * @param title --> Title of the book
    * @returns the book 
    */
   public LibraryBook findByTitle( String title ) {
      if( b1 != null && title.equals( b1.getTitle() ) )
         return b1;
      else if( b2 != null && title.equals( b2.getTitle() ) )
         return b2;
      else if( b3 != null && title.equals( b3.getTitle() ) )
         return b3;
      else if( b4 != null && title.equals( b4.getTitle() ) )
         return b4;
      else 
         return null;
   }
}
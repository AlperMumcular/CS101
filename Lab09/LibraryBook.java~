/**
 * represent an individual book that can be borrowed from the library
 */
public class LibraryBook 
{
   // properties
   private String title;
   private String author;
   private String dueDate;
   private int timesLoaned;

   // constructors
   public LibraryBook( String author, String title) {
      this.author = setAuthor( author );
      this.title = setTitle( title );
      this.dueDate = setDueDate ( "" );
      this.timesLoaned = setTimesLoaned( 0 );
   }
      
   // copy constructor
   public LibraryBook ( LibraryBook other ) {
      this.author = setAuthor( other.getAuthor() );
      this.title = setTitle( other.getTitle() );
      this.dueDate = setDueDate ( other.getDueDate() );
      this.timesLoaned = setTimesLoaned( other.getTimesLoaned() );
   }
   
   // accessor methods
   public String getTitle() {
      return this.title;
   }
   
   public String getAuthor() {
      return this.author;
   }
   
   public String getDueDate() {
      return this.dueDate;
   }
   
   public int getTimesLoaned() {
      return this.timesLoaned;
   }
   
   // mutator methods
   private String setTitle( String title ) {
      this.title = title;
      return this.title;
   }
   
   private String setAuthor( String author ) {
      this.author = author;
      return this.author;
   }
   
   private String setDueDate( String date ) {
      this.dueDate = date;
      return this.dueDate;
   }
   
   private int setTimesLoaned( int loan ) {
      this.timesLoaned = loan;
      return this.timesLoaned;
   }
   
   // other methods 
   
   /**
    * loans the book
    * @param title --> title of the book
    */
   public void loanBook( String title ) {
      if( !this.onLoan() ) { 
         this.dueDate = setDueDate( "01.05.2020" ); 
         this.timesLoaned++; 
      }
      else 
         System.out.println( "book has already loaned." );
   }
   
   /**
    * returns the book
    * @param title --> title of the book
    */
   public void returnBook( String title ) {
      if( this.onLoan() ) 
         this.dueDate = setDueDate( "" );
      else
         System.out.println( "Book has already in library." );
   }
   
   /**
    * checks the book if it is on loan
    * @return boolean result
    */
   public boolean onLoan() {
      if (this.dueDate.equals( "" ))
         return false;
      else 
         return true;
   }
   
   /**
    * represents any LibraryBook object as a String
    * @return string result of the object
    */
   @Override
   public String toString() {
      return "{Title: " + this.title + ", Author: " + this.author + ", Due Date: " + this.dueDate 
         + ", Times Loaned: " + this.timesLoaned + "}";
      
   }
   
   /**
    * compares their titles and authors
    * @param other --> another book from the LibraryBook class
    * @return boolean result
    */
   public boolean equals( LibraryBook other ) {
      if ( title.equals( other.getTitle() ) && author.equals( other.getAuthor() ) ) 
         return true;
      else
         return false;
   }
   
   /**
    * compares their titles 
    * @param other --> another book from the LibraryBook class
    * @return boolean result
    */
   public boolean hasSameTitle( LibraryBook other ) {
      if ( title.compareTo( other.getTitle() ) == 0 )
         return true;
      else
         return false;
   }
   
   /**
    * compares their authors
    * @param other --> another book from the LibraryBook class
    * @return boolean result
    */
   public boolean hasSameAuthor( LibraryBook other ) {
      if ( author.compareTo( other.getAuthor() ) == 0 )
         return true;
      else
         return false;
   }
}
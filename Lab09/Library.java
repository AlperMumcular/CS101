import java.util.ArrayList;
/**
 * represents a library
 */
public class Library 
{
   // properties
   private ArrayList<LibraryBook> bookList;
   
   // constructors
   public Library() {
      bookList = new ArrayList<LibraryBook>();
   }
   
   // other methods
   
   /**
    * checks are there any books 
    * 
    * @return boolean result
    */
   public boolean isEmpty() {
      if( bookList.size() == 0 )
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
         String str = "";
         for( int n = 0; n < bookList.size(); n++ )
            str += bookList.get(n) + "\n";
         return str;
      } 
   }
   
   /**
    * adds book 
    * @param author, title --> Author and title of the book which is going to be added to library
    * @return boolean result
    */
   public boolean add( String author, String title ) {
      LibraryBook b1 = new LibraryBook(author, title);
      if(bookList.size() == 0)
         bookList.add(b1);
      else {
         int n;
         for( n = 0; n < bookList.size(); n++ ) {
            if( b1.getAuthor().compareTo( bookList.get( n ).getAuthor() ) < 0 ) {
               bookList.add( n, b1 );
               n = bookList.size() + 1;
            }
            else if( b1.getAuthor().compareTo( bookList.get( n ).getAuthor() ) == 0 ) {
               if( b1.getTitle().compareTo( bookList.get( n ).getTitle() ) < 0 ) {
                  bookList.add( n, b1 );
                  n = bookList.size() + 1;
               }
            }   
         }
         if( n != bookList.size() + 2 )
            bookList.add( b1 );
      }
      return true;
   }
   
   /**
    * removes book if this book is in the library
    * @param book --> which book wants to be removed from library
    * @return boolean result
    */
   public boolean remove( LibraryBook book ) {
      
      for( int n = 0; n < bookList.size(); n++) {
         if(book.equals( bookList.get(n) ) ) {
            bookList.remove(n);
            return true;
         }
      }      
      return false;
   }
   
   /**
    * finds the book from its title
    * @param title --> Title of the book
    * @returns the book 
    */
   public LibraryBook findByTitle( String title ) {
      for( int n = 0; n < bookList.size(); n++) {
         if( title.equals( bookList.get(n).getTitle() ) )
            return bookList.get(n);
      } 
      return null;
   }
   
   /**
    * finds the book from its author
    * @param author --> author of the book
    * @returns all the books belong to the author
    */
   public String findByAuthor( String author ) {
      String str = "";
      for( int n = 0; n < bookList.size(); n++) {
         if( author.equals( bookList.get(n).getAuthor() ) )
            str += bookList.get(n) + "\n";
      }
      if( str.equals("") ) {
         str = "Error";
      }
         return str; 
   }
}
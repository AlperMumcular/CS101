import java.util.Scanner;

/**
 * Library Simulation 
 * @author Alper Mumcular
 * @version 30.04.2020
 */ 
public class LibraryTest
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );

      // variables
      Library library = new Library();
      int option;
      int option2;
      String title, author;
      
      // program code
      do {
         System.out.print( "1-Show\n2-Find\n3-Add\n4-Exit\nChoose an option:" );
         option = scan.nextInt();
         scan.nextLine();
         if( option == 1 ) {
            System.out.println( library.toString() );
         }
         
         else if( option == 2 ) {
            System.out.print( "Enter a title: " );
            title = scan.nextLine();
            if( library.findByTitle( title ) != null ) {
               System.out.println();
               System.out.print( "1-Loan\n2-Return\n3-Remove\n4-Return to Menu\nChoose an option: " );
               option2 = scan.nextInt();
               if( option2 == 1 ) {
                  library.findByTitle( title ).loanBook( title );
               }
               
               else if( option2 == 2 ) {
                  library.findByTitle( title ).returnBook( title );
                  if ( library.findByTitle( title ).onLoan() )
                     System.out.println( "The book with title \"" + title + "\" has been returned to library.\n" );
               }
               
               else if( option2 == 3 ) {
                  library.remove( library.findByTitle( title ) );
                  System.out.println( "The book with title \"" + title + "\" has been removed from library.\n" );
               }
            }
            else
               System.out.println( "Book couldn't found." );
         }
         
         else if( option == 3 ) {
            System.out.print( "Enter a title: " ); 
            title = scan.nextLine();
            System.out.print( "Enter an author: " );
            author = scan.nextLine();
            if( library.add( author, title ) )
               System.out.println( "The book with title \"" + title + "\" has been added to library.\n" );
         } 
      } while ( option != 4 );
      
      System.out.println( "Yine Bekleriz.." );
   }

}
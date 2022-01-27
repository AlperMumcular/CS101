/**
 * MyArray application
 * @author Alper Mumcular
 * @version 22.05.2020
 */ 
public class TestMyArray
{
   public static void main( String[] args )
   {

      // variables
      MyArray test1;
      MyArray empty;
      Balanced test;
      
      // program code
      test1 = new MyArray();
      empty = new MyArray( 0 );

      // testing findLucky() with many cases
      System.out.println( "---------------- findLucky() --------------------" );
      System.out.println( test1 );
      test1.setArray( new int[] { 1, 2, 2, 3, 3, 3 } );
      System.out.println( test1 );
      System.out.println( "The lucky integer is " + test1.findLucky() + "\n" );
      
      test1.setArray( new int[] { 5, 5, 5, 5, 5 } );
      System.out.println( test1 );
      System.out.println( "The lucky integer is " + test1.findLucky() + "\n" );
      
      test1.setArray( new int[] { 2, 2, 25 } );
      System.out.println( test1 );
      System.out.println( "The lucky integer is " + test1.findLucky() + "\n" );
      
      test1.setArray( new int[] { 0, 1, 1, 2, 2, 2 } );
      System.out.println( test1 );
      System.out.println( "The lucky integer is " + test1.findLucky() + "\n" );
      
      test1.setArray( new int[] { 1 } );
      System.out.println( test1 );
      System.out.println( "The lucky integer is " + test1.findLucky() + "\n" );
      
      test1.setArray( new int[] {} );
      System.out.println( test1 );
      System.out.println( "The lucky integer is " + test1.findLucky() + "\n" );
      
      System.out.println( empty );
      System.out.println( "The lucky integer is " + empty.findLucky() + "\n" );
      
      // testing isBalanced() with many cases
      System.out.println( "---------------- isBalanced() --------------------" ); 
      test1.setArray( new int[] { 10, 1, 2, 7, 0, 6 } );
      test = test1.isBalanced();
      System.out.println( test1 + "\n" + test + "\n" );
      
      test1.setArray( new int[] { 150, 3, 145, 8 } );
      test = test1.isBalanced();
      System.out.println( test1 + "\n" + test + "\n" );
      
      test1.setArray( new int[] { 10, 1, 2, 7, 0 } );
      test = test1.isBalanced();
      System.out.println( test1 + "\n" + test + "\n" );
      
      test1.setArray( new int[] { 1, 1 } );
      test = test1.isBalanced();
      System.out.println( test1 + "\n" + test + "\n" );
      
      test1.setArray( new int[] { -10, -5, -7, -15, -10, 3 } );
      test = test1.isBalanced();
      System.out.println( test1 + "\n" + test + "\n" );
      
      test1.setArray( new int[] { 1 } );
      test = test1.isBalanced();
      System.out.println( test1 + "\n" + test + "\n" );
      
      test1.setArray( new int[] { 0 } );
      test = test1.isBalanced();
      System.out.println( test1 + "\n" + test + "\n" );
      
      test1.setArray( new int[] {} );
      test = test1.isBalanced();
      System.out.println( test1 + "\n" + test + "\n" );
      
      System.out.println( empty );
      test = empty.isBalanced();
      System.out.println( test + "\n" );
      
      // testing merge() method with many cases
      System.out.println( "---------------- merge() --------------------" );
      test1 = new MyArray( 10 );
      test1.merge( new int[] { 99, 65, 45, 21, 31 } );
      
      test1.merge( new int[] {} );
      
      test1.merge( new int[] { 1 } );
      
      empty.merge( new int[] {} );
      
      empty.merge( new int[] { 2, 6, 7, 9 } );
      empty = new MyArray( 0 );
      
      
      // testing randomize() method with many cases
      System.out.println( "---------------- randomize() --------------------" );
      test1.randomize();
      
      test1.setArray( new int[] { 2, 8, 10, 6, 7, 15, 93, 100, 1, 0, -1, -5 } );
      test1.randomize();
      
      test1.setArray( new int[] { 0, 20 } );
      test1.randomize();
      
      test1.setArray( new int[] { 1 } );
      test1.randomize();
      
      test1.setArray( new int[] {} );
      test1.randomize();
      
      empty.randomize();
      
      // testing sort() method with many cases
      System.out.println( "---------------- sort() --------------------" );
      test1.sort();
      
      test1.setArray( new int[] { 250, -99, 50, 2, 1, 1, 1, 2, 0, 30, 40 } );
      test1.sort();
      
      test1.setArray( new int[] { 2, 2 } );
      test1.sort();
      
      test1.setArray( new int[] { 2, 1 } );
      test1.sort();
      
      test1.setArray( new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 } );
      test1.sort();

      test1.setArray( new int[] { 6, 9, 7, 2, 3, 8, 5, 1, 4, 0 } );
      test1.sort();
      
      test1.setArray( new int[] {} );
      test1.sort();

      empty.sort();
   }

}
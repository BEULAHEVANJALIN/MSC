public class WhileLoop
    {
       public static void main( String[] args )
       {
          int counter = 2000; // initialize counter
 
         do                                          
         {                                           
            System.out.printf( "%d  ", counter );    
            counter--;                               
         } while ( counter >= 1000 ); // end do...while

         System.out.println(); // outputs a newline
      } // end main
   } // end class WhileLoop
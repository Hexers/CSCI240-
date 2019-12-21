import javax.swing.JOptionPane;

public class Smallest {

   public static void main( String args[] )
   {
      int smallest = 0, temp = 0, number;
      String input;

      input = JOptionPane.showInputDialog(
         "Enter number of integers:" );
      number = Integer.parseInt( input );

      if ( number == 0 )
         System.exit( 0 ); 
        
      for ( int x = 1; x <= number; x++ ) {         
         input = JOptionPane.showInputDialog(
            "Enter integer:" );
         temp = Integer.parseInt( input );
         
         if ( x == 1 ) 
            smallest = temp; 
         else if ( temp < smallest )
            smallest = temp;
      }
     
      JOptionPane.showMessageDialog(
         null, "Smallest Integer is: " + smallest,
         "Result", JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );
   }
}
import javax.swing.JOptionPane;

public class Application {

	public static void main( String args[] )
	{
		int product = 1;

		for ( int x = 3; x <= 15; x += 2 )
			product *= x;

		JOptionPane.showMessageDialog( null, "Product is " + product, 
				"Odd Product", JOptionPane.INFORMATION_MESSAGE );

		System.exit( 0 );
	}

}
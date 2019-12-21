import java.awt.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.*;

public class Sales {

	public static void main( String args[] )
	{
		float product1 = 0, product2 = 0, product3 = 0;
		float product4 = 0, product5 = 0;

		String inputString;

		int productId = 1;

		while (productId != 0) {

			inputString = JOptionPane.showInputDialog(
					"Enter product number (1-5) (0 to stop):" );
			productId = Integer.parseInt( inputString );

			if ( productId >= 1 && productId <= 5 ) {

				inputString = JOptionPane.showInputDialog(
						"Enter quantity sold:" );
				int quantity = Integer.parseInt( inputString );


				switch ( productId ) {

				case 1:
					product1 += quantity * 2.98;
					break;

				case 2:
					product2 += quantity * 4.50;
					break;

				case 3:
					product3 += quantity * 9.98;
					break;

				case 4:
					product4 += quantity * 4.49;
					break;

				case 5:
					product5 += quantity * 6.87;
					break;
				}

			}
			else if ( productId != 0 ) {
				JOptionPane.showMessageDialog( null,
						"Product number must be between 1 and 5 or 0 to stop", 
						"Input Error", JOptionPane.INFORMATION_MESSAGE );
			}
		}

		NumberFormat moneyFormat =
				NumberFormat.getCurrencyInstance( Locale.US );


		String output = "Product 1: " + moneyFormat.format( product1 );
		output += "\nProduct 2: "+ moneyFormat.format( product2 );
		output += "\nProduct 3: " + moneyFormat.format( product3 );
		output += "\nProduct 4: " + moneyFormat.format( product4 );
		output += "\nProduct 5: " + moneyFormat.format( product5 ) + "\n";

		JTextArea outputArea = new JTextArea( 6, 20 );
		outputArea.setText( output );


		JOptionPane.showMessageDialog( null, outputArea,
				"Totals", JOptionPane.INFORMATION_MESSAGE );

		System.exit( 0 );
	}

}
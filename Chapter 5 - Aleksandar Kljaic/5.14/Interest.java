import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.*;

public class Interest {

	public static void main( String args[] )
	{
		NumberFormat moneyFormat =
				NumberFormat.getCurrencyInstance( Locale.US );


		JTextArea outputTextArea = new JTextArea( 13, 20 );
		JScrollPane scroller = new JScrollPane( outputTextArea );


		double principal = 1000.0;


		for ( int interestRate = 5; interestRate <= 10; interestRate++ ) {
			double rate = interestRate / 100.0;
			outputTextArea.append( "\nInterest Rate: " + 
					interestRate + "%\n" );
			outputTextArea.append( "Year\tAmount on deposit\n" );


			for ( int year = 1; year <= 10; year++ ) {
				double amount = principal * ( 1.0 + rate );


				for ( int power = 2; power <= year; power++ )
					amount *= ( 1.0 + rate );

				outputTextArea.append( year + "\t" +
						moneyFormat.format( amount ) + "\n" );
			}
		}


		JOptionPane.showMessageDialog( null, scroller,
				"Compound Interest", JOptionPane.INFORMATION_MESSAGE );


		System.exit( 0 );
	}
}
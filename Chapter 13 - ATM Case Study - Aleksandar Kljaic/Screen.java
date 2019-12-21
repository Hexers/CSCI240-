// Chapter 13 - ATM Case Study
// Aleksandar Kljaic
// November 27, 2014
//
// Screen.java
// Represents the screen of the ATM
public class Screen 
{
	// display a message without a carriage return
	public void displayMessage( String message )
	{
		System.out.print( message );
	} // end method displayMessaage
	
	// display a message with a carriage return
	public void displayMessageLine( String message )
	{
		System.out.println( message );
	} // end method displayMessageLine
	
	// displays a dollar amount
	public void displayDollarAmount( double Amount )
	{
		System.out.prinf( "$%,.2f", amount );
	} // end method displayDollarAmount
} // end class Screen

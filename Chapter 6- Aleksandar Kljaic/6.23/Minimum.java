// Exercise 6.23 - Aleksandar Kljaic
import java.util.Scanner;

public class Minimum
{
	public void findMinimum()
	{
		Scanner input = new Scanner( System.in );

		double one;
		double two;
		double three;

		System.out.printf( "%s\n %s\n %s\n", 
				"Type the end-of-file indicator to terminate", 
				"On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
				"On Windows type <ctrl> z then press Enter" );
		System.out.print( "Or enter first number: " );

		while ( input.hasNext() )
		{
			one = input.nextDouble();
			System.out.print( "Enter second number: " );
			two = input.nextDouble();
			System.out.print( "Enter third number: " );
			three = input.nextDouble();
			System.out.printf( " Minimum is %f\n",
					minimum3( one, two, three ) );

			System.out.printf( "\n%s\n %s\n %s\n", 
					"Type the end-of-file indicator to terminate", 
					"On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
					"On Windows type <ctrl> z then press Enter" );
			System.out.print( "Or enter first number: " );
		}
	}
	
	public double minimum3( double one, double two, double three )
	{
//
		return Math.min( Math.min( one, two ), three );
	}
}
// Exercise 6.20 - Aleksandar Kljaic
import java.util.Scanner;

public class Circle
{
	public void calculateAreas()
	{
		Scanner input = new Scanner( System.in );

		System.out.print( "Enter the radius (negative to quit): " );
		double radius = input.nextDouble();

		while ( radius >= 0 )
		{
			circleArea( radius );

			System.out.print( "Enter the radius (negative to quit): " );
			radius = input.nextDouble();
		}
	}

	public void circleArea( double radius )
	{
		System.out.printf( "Area is %f\n", Math.PI * radius * radius );
	}
}
//Exercise 6.17 - Aleksandar Kljaic
import java.util.Scanner;

public class EvenOdd
{
	public void checkEvenOdd()
	{
		Scanner input = new Scanner( System.in );
		
		System.out.printf( "%s\n%s\n %s\n %s\n",
				"Enter numbers to determine if they are even or odd.",
				"Type the end-of-file indicator to terminate input:",
				"On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
				"On Windows type <ctrl> z then press Enter" );
		while ( input.hasNext() )
		{
			int number = input.nextInt();
			
			if ( isEven( number ) )
				System.out.printf( "%d is even\n", number );
			else
				System.out.printf( "%d is odd\n", number );
				
		}
	}
	public boolean isEven ( int number )
	{
		return number % 2 == 0;
	}
}
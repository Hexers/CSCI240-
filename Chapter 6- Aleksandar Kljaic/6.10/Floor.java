//Exercise 6.10 - Aleksandar Kljaic
import java.util.*;
 
public class Floor
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner( System.in );
 
		double y1;
		double y2;
		double y3;
		double y4;
				
		System.out.print("Enter a value to be rounded :");
		double number1 = input.nextDouble();
		
		y1 = Math.floor(number1 + 0.5);
		y2 = Math.floor(number1 * 10 + 0.5) / 10;
		y3 = Math.floor(number1 * 100 + 0.5) / 100;
		y4 = Math.floor(number1 * 1000 + 0.5) / 1000;
		
		System.out.println("The number rounded to integer is: " + y1);
		System.out.println("The number rounded to tenths is: " + y2);
		System.out.println("The number rounded to hundredths is: " + y3);
		System.out.println("The number rounded to thousandths is: " + y4);
		
	}
}
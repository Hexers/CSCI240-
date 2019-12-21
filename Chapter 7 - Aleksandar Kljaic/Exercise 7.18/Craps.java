// Exercise 7.18 - Aleksandar Kljaic
import java.util.Random;

public class Craps
{
	public static int rollCount;
	public static boolean winLose;
	
	private Random randomNumbers = new Random();

	public enum Status { CONTINUE, WON, LOST };
	
	private final static int SNAKE_EYES = 2;
	private final static int TREY = 3;
	private final static int SEVEN = 7;
	private final static int YO_LEVEN = 11;
	private final static int BOX_CARS = 12;
	
	public void play() {
		rollCount = 0;
		int myPoint = 0;
		Status gameStatus;
		int sumOfDice = rollDice();
		rollCount++;

		switch ( sumOfDice ){
			case SEVEN:
			case YO_LEVEN:
				gameStatus = Status.WON;
				break;
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOST;
				break;
			default:
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDice;
				break;
		}
		
		while ( gameStatus == Status.CONTINUE )
		{
			sumOfDice = rollDice();
			rollCount++;
			if ( sumOfDice == myPoint )
				gameStatus = Status.WON;
			else
				if ( sumOfDice == SEVEN )
					gameStatus = Status.LOST;
		}
		
		if ( gameStatus == Status.WON ){			
			winLose = true;
		}	
		else {
			winLose = false;
		}
	}
	
	public int rollDice(){
		int die1 = 1 + randomNumbers.nextInt( 6 );
		int die2 = 1 + randomNumbers.nextInt( 6 );
		int sum = die1 + die2;
			
		return sum;
	}
	
	public static void main( String args[] )
	{
	Craps game = new Craps();
	game.play();
	}
}
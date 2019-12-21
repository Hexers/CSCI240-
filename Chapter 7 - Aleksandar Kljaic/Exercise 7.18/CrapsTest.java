// Exercise 7.18 - Aleksandar Kljaic
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CrapsTest {
	static int winningRoll[] = new int[40];
	static int losingRoll[] = new int[40];
	static int rollNumber, rollSum, limit, totalVictories;
	static double chances, averageRoll;
	
	public static void main( String args[] ) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the number of games you  would like to run: ");
		double temp = Double.parseDouble(in.readLine());
		limit = (int) temp;
		gatherStats();
		getStats();
		
	}
	
	public static void runCrapsGame(){
		Craps game = new Craps();
		game.play();
	}
	

	public static void gatherStats(){
		for (int i=0; i<20; i++){
			winningRoll[i]=0;
			losingRoll[i]=0;
		}
		rollSum = 0;
		totalVictories=0;
		rollNumber=0;
		
		
		for (int i = 0; i<limit; i++){
			runCrapsGame();
			rollNumber=Craps.rollCount;
			rollSum = rollSum + rollNumber;
			if (Craps.winLose == true){
				int j = rollNumber;
				winningRoll[j]++;
				totalVictories++;
			}	
			else {
				int j = rollNumber;
				losingRoll[j]++;
			}	
		}
		
		double temp = limit;
		double temp2 = rollSum;
		chances = (totalVictories/temp) * 100;
		averageRoll = temp2/temp;
	}
	
	public static void getStats(){
		
		System.out.println();
		System.out.println("Total Victories are: " + totalVictories);
		System.out.println("Chances at winning are: "+ chances+"%");
		System.out.println("Average Number of rolls per game: " + averageRoll);
		System.out.println();
		System.out.println("#      W      L             Chance");
		for (int i = 1; i<30; i++){
			double temp = winningRoll[i];
			double localChance = (temp/limit)*100;
			System.out.print("After " + i + " rolls of the dice ");
			System.out.print(" there were " + winningRoll[i] + " games won and " + losingRoll[i] +" games lost with a "+ localChance+"% chance of winning.");
			System.out.println();
		}
	}
}
package craps;

public class CrapsGame {
	

	
	
	public static void main (String[] args)
	{
		int wins = 0;
		int losses = 0;
		int score = 0;
		int points = 0;
		Die die1 = new Die();
		Die die2 = new Die();
		
		die1.rollDie();
		die2.rollDie();
		
		score = die1.getPips() + die2.getPips();
		
		//Roll 
		
		if (score == 7 || score == 11)
		{
			//System.out.println("Score = " + score);
			// "you win"
			wins = wins + 1;
		}
		
		else if (score == 2 || score == 3 || score == 12)
		{
			//System.out.println("Score = " + score);
			// "you lose"
			losses = losses + 1;
		}
		
		else
		{
			//System.out.println("Score = " + score);
			// "you lose"
			points = points + score;
		}		
		
		
	}

}

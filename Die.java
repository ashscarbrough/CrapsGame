package craps;
import java.util.Random;

public class Die 
{
	private int pips;
	
	Random rand = new Random();
	
	Die (){
		pips = (int) (rand.nextInt());
	}

	public void rollDie () 
	{
		pips = (int)(rand.nextInt());
	}
	
	public int getPips (){
		return pips;
	}
	
	public void setPips(int num){
		pips = num;
	}
	
	public boolean equal(Die dice){
		return this.pips == dice.pips;
	}
}

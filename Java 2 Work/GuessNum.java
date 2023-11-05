import javax.swing.JOptionPane;
import java.util.Random;
public class GuessNum extends BasicGame {
	
	private Random rand;
	private int secretNumber;
	private int usersNumber;
	
	public GuessNum()
	{
		rand = new Random();
	}
	
	public void askUsersFirstChoice()
	{
		secretNumber = rand.nextInt(100) +1;
		askUsersNextChoice();
		
	}
	
	public void askUsersNextChoice()
	{
		String msg = "Guess a random number between 0 and 100";
		String input = 
				JOptionPane.showInputDialog(null, msg);
		if (input != null && !input.equals(""))
			usersNumber = Integer.parseInt(input);
		else
			usersNumber = -1;
	}
	
	public boolean shouldContinue()
	{
		boolean rval = usersNumber != secretNumber;
		return rval;
	
	}
	
	public void showUpdatedStatus()
	{
		String msg;
		if (usersNumber < secretNumber)
			msg = "Too low, guess again";
		else
			msg = "Too high, guess again";
	}

}

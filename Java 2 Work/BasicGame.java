import javax.swing.JOptionPane;
public class BasicGame 
{
	private String secretWord = "duck";
	private String UsersGuess = "";
	
	public void playOneGame()
	{
		askUsersFirstChoice();
		while (ShouldContinue() )
		{
			showUpdatedStatus();
			askUsersNextChoice();
		
		}
		
	}
	
	public void playManyGames()
	{
		int again = 0;
		do
		{
			playOneGame();
			again = JOptionPane.showConfirmDialog(null, "again?");
		} while( again == JOptionPane.YES_OPTION);
	}
	
	public void askUsersFirstChoice()
	{
		String message = "Guess the Secret Word";
		UsersGuess = 
				JOptionPane.showInputDialog(null, message);
		
	}
	
	public void askUsersNextChoice()
	{
		askUsersFirstChoice();
	}
	
	public boolean ShouldContinue()
	{
		boolean rval = !secretWord.equals( UsersGuess);
		return rval;
		
	}
	
	public void showUpdatedStatus()
	{
		String message = "That was wrong, guess again.";
		JOptionPane.showMessageDialog(null,  message);
	}
	public void showFinalStatus()
	{
		String message = "Great! JoB!";
		JOptionPane.showMessageDialog(null, message);		
	}

	
}

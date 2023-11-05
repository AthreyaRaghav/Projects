import javax.swing.JOptionPane;

public class Poodle extends Dog 
{
	
	public void showMessage(String msg)
	{
		
		String str = "Arf, Arf" + msg;
		JOptionPane.showMessageDialog(null, str);
	}
	
	
	

}

import javax.swing.JOptionPane;

public class Dog extends JOptionPane
{
	public void showMessage(String msg)
	{	
		String str  = "woof, woof" + msg;
		JOptionPane.showInternalMessageDialog(null, str);
		
	
	}

}

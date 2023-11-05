import javax.swing.JOptionPane;
public class joptionpane
{
	public static void main(String[] args)
	{
		String input = 
			JOptionPane.showInputDialog( null, "Enter your name");
		String name = "Your name is:" + input;
		JOptionPane.showMessageDialog( null, name);
	}
}
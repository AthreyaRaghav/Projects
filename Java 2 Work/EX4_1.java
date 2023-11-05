import javax.swing.JOptionPane;
public class EX4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message1 = "Enter a string of characters";
		String message2  = "Enter another string of characters";
		String input1 = 
				JOptionPane.showInputDialog(null,message1);
		String input2 = 
				JOptionPane.showInputDialog(null,message2);
		String reply;
		if (input1 == null || input2 == null)
			reply = "Stop fooling around please";
		else if (input1.equals(input2))
			reply = "equal";
		else
			reply = "not equal";
		JOptionPane.showMessageDialog(null,reply);

	}

}

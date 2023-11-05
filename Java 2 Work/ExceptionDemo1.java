import javax.swing.JOptionPane;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lowLimit = -100;
		int highLimit = 100;
		String prompt = 
			"Enter a number between " + lowLimit + " and " + highLimit;
		
		
		String str = 
				JOptionPane.showInputDialog(null, prompt);
		int      avg = 0;
		int val = 0;
		try {
			
			
			val = Integer.parseInt(str);
			avg = 32/val;
			JOptionPane.showMessageDialog(null, "you entered " + val);
		}
		catch (NumberFormatException exc)
		{
			String msg = str + " is not an integer";
			JOptionPane.showMessageDialog(null, msg);
		}
		catch ( ArithmeticException exc)
		{
			
			String msg = "Whoops " + val + " isn't a good devisor";
			JOptionPane.showMessageDialog(null, msg);
		}


	}

}

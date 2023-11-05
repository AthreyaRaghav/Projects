import java.util.StringTokenizer;
import javax.swing.JOptionPane;
public class Ex7Slide6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prompt = "Enter state and year of inclusion";
		String input = IOUtils.askLine(prompt);
		StringTokenizer tizer = new StringTokenizer(input);
		int count = tizer.countTokens();
		if (count != 2)
			JOptionPane.showMessageDialog(null, "Invalid input");
		String state = tizer.nextToken();
		String strYear = tizer.nextToken();
		int intYear = Integer.parseInt(strYear);
		String feedback = 
				"State " + state
				+ " year: " + intYear;
		JOptionPane.showMessageDialog(null, feedback);

	}


	
	
}


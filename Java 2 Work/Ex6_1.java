import javax.swing.JOptionPane;

public class Ex6_1 {

	public static void main(String[] args) {
		
		
		IOUtils math = new IOUtils();
		String prompt = "Enter a decimal number";
//		
		double dVar1 = math.askDouble(prompt);
//		input = JOptionPane.showInputDialog(null, prompt);
		double dVar2 = IOUtils.askDouble(prompt);
//		input = JOptionPane.showInputDialog(null, prompt);
		double dVar3 = math.askDouble(prompt);
		double avg = ((dVar1+dVar2+dVar3) /3);
		
		System.out.println(avg);



	}

}

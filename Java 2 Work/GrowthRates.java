import javax.swing.JOptionPane;

public class GrowthRates {
	
	public GrowthRates()
	{
		String prompt = "Annual rate? (0 if done)";
		String input = JOptionPane.showInputDialog(null,prompt);
		double rate = Double.parseDouble(input);
		while (rate > 0)
		{
			int years = yearsToDouble(rate);
			StringBuilder bldr = new StringBuilder();
			bldr.append("It takes").append(years)
				.append("Years to double your money");
			JOptionPane.showMessageDialog(null, bldr);
			input = JOptionPane.showInputDialog(null,prompt);
			rate = Double.parseDouble(input);
		}
	}
	
	public int yearsToDouble(double intrestRate)
	{
		double balance = 1;
		double rate = intrestRate/100;
		int count = 0;
		while(balance <2)
		{
			balance = balance * (1+rate);
			++count;
			
		}
		return count;
	}

}

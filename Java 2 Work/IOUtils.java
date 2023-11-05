import javax.swing.JOptionPane;

public class IOUtils {
	
	IOUtils()
	{
		
	}
	
	public static void say(Object message )
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	public static String askLine(String prompt)
	{
		String input = 
				JOptionPane.showInputDialog(null, prompt);
		return input;
		
	}
	public static int askInt(String prompt)
	{
		String invalid = "WARNING! The Input you have provided is invalid";
		String input = askLine(prompt);
		int result  = Integer.MIN_VALUE;
		boolean rval =true;
		try {
			Integer.parseInt(input);
		}
		catch(NumberFormatException exc) {
			rval = false;
			say(invalid);
		}
		if (input != null && rval == true)
			result = Integer.parseInt(input);
		return result;
	}
	
	public static double askDouble(String prompt)
	{
		

		String input = askLine(prompt);
		double result = Double.NaN;
		String invalid = "WARNING! The Input you have provided is invalid";
		boolean rval = true;
		 
		
		try
	    {
	        Double.parseDouble( input );
	        
	    }
	    catch ( NumberFormatException exc )
	    {
	        say(invalid);
	        rval = false;
	    }

		
		
		
		
		if ( input != null && rval == true)
			result = Double.parseDouble(input);
		
		return result;


	}
	
	public static void isNegative(String prompt)
	{
		int result =-1;
		do
		{
			result = askInt(prompt);
			if (result < 0)
				say("that was a negative number(notallowed)");
			
		}while(result <0);
	}
	
	public static int askNearestInt(String prompt)
	{
		String input = askLine(prompt);
		double dnum = Double.parseDouble(input);
		int result = (int)(dnum + 0.5);
		return result;
		
	}
	

	

}

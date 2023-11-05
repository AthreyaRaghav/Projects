
public class Layexceptiondemohandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intVar = 0;
		int jVar = 0;
		String input = IOUtils.askLine("enter an integer");
		try
		{
			intVar = Integer.parseInt(input);
			jVar = 42/intVar;
		}
		catch(NumberFormatException exc)
		{
			
		}

	}

}

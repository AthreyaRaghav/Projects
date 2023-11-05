
public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		String input = IOUtils.askLine("enter an integer");
		int intVar = 0;
		int jVar = 0;
		
		try
		{
			intVar = Integer.parseInt(input);
			jVar = 42/intVar;
			
		}
		catch(ArithmeticException exc)
		{
			System.out.println(exc.getMessage());
		}

	}

}

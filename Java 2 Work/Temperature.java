
public class Temperature {
	private double celsius;
	public Temperature( double temp)
	{
		celsius = temp;
	}
	
	public Temperature(double temp, String scale)
	{
		
		if ( scale.startsWith("F"))
			celsius = toCelsius(temp);
		else
			celsius = temp;
	}
	
	public string toString()
	{
		String str = celsius + "C"
		return str;
	}
	
	private static double toClesius(double celsius)
	{
		return 0;
	}

}

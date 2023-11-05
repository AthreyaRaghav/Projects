
public class Arithmetic 
{
	public static int larger(int param1, int param2)
	{
		int rval = 0;
		if (param1 > param2)
			rval = param1;
		if (param2>param1)
			rval = param2;
		return rval;
		
		
	}
	public static int largerAlt(int param1, int param2)
	{
		int rval = param1>param2?param1:param2;
		return rval;
	}

}

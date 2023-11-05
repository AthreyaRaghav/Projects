import uw.syp.java.tools.Vic;
public class Victest
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		SmartVic dave = new SmartVic();
		
		dave.frontSwap();
		
	}
}

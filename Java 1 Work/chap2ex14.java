import uw.syp.java.tools.Vic;

public class chap2ex14
{
	public static void main( String[] args)
	{
		Vic.reset(args)
		Vic fred = new Vic();
		if ( fred.seesSlot())
		{
			fred.moveOn();
			if (fred.seesSlot())
			{
				fred.moveOn();
				if (fred.seesSlot())
				{
					fred.takeCD();
					
				}
				fred.moveOn()
			}
		}
		
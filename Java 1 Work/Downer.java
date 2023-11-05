import uw.syp.java.tools.Vic;
public class Downer extends Vic
{
	public void downShift()
	{
		if (seesSlot())
		{
			if (seesCD())
			{
				takeCD();
				moveOn();
				if (seesSlot())
				{
					if (seesCD())
					{
						
					}
					else
						putCD();
				}
			}
		}
	}
}
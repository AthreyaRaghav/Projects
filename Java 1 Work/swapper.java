import uw.syp.java.tools.Vic;

public class swapper extends Vic
{
	public void swapTwo()
	{
		if (seesSlot())
		{
			moveOn();
			if(seesSlot())
			{	
				if(seesCD())
				{
					backUp();
					if(seesCD())
					{
						takeCD();
						moveOn();
						takeCD();
						backUp();
						putCD();
						moveOn();
						putCD();
						backUp();
					}
				}
				
			}
			
		}
		backUp();
	}
	public void fillThree()
	{
		if( Vic.stackHasCD() )
		{
			if (seesSlot())
			{
				putCD();
				moveOn();
				if (seesSlot())
				{
					if(Vic.stackHasCD())
					{
						putCD();
						moveOn();
						if (seesSlot())
						{
							if (Vic.stackHasCD())
							{
								putCD();
							}
						}
					}
				}
			}
			
		}
	}
}
import uw.syp.java.tools.Vic;

public class whileVic extends Vic
{
	public void removeAllCDs()
	{
		while(seesSlot())
		{
			if (seesCD())
			{	
				takeCD();
			}
			moveOn();
		}
	}
	public void lastSlot()
	{
		while(seesSlot())
		{
			moveOn();
		}
		backUp();
	}
	public void takeOneBefore()
	{
		backUp();
		boolean rval = true;
		while(rval)
		{
			backUp();
			if (seesSlot())
			{
				rval = true;
			}
			if(seesCD())
			{
				takeCD();
				rval = false;
			}
		}
	}
	public void fillFirstEmptySlot()
	{
		String savepos = getPosition();
		boolean rval = true;
		while (rval)
		{
			if (seesSlot())
			{
				
				if (!seesCD())
				{
					putCD();
					rval = false;
				}
				else
				{
					moveOn();
				}
			}
		}
		while(!savepos.equals(getPosition()))
		{
			backUp();
		}
	}
	public void fillLastEmptySlot()
	{
		
		boolean rval = true;
		boolean rule = false;
		String savepos = getPosition();
		while(rval)
		{
			
			moveOn();
			if(!seesSlot())
			{	
				backUp();					
				if(Vic.stackHasCD())
				{
					if(!seesCD())
					{
						putCD();
					}
				}
				
				rval = false;
			}
			else
				rule = true;
				
			
			
			
		}
		while(!savepos.equals(getPosition()))
		{	
			
			backUp();
			if (rule == true)
			{
				if(Vic.stackHasCD())
				{
					if(!seesCD())
					{
						putCD();
						rule = false;
					}
				}
			}
		}
		
	}
	public boolean lastisFilled()
	{
		while(seesSlot())
		{
			moveOn();
		}
		backUp();
		boolean rval = seesCD();
		return rval;
	}
	public void goToFirstEmpty()
	{
		boolean rval = true;
		while(rval)
		{
			if(seesSlot())
			{
				if (seesCD())
				{
					moveOn();
					
				}
				if (!seesCD())
				{
					rval = false;
				}
			}
			
		}
		
	}
	
	
	public boolean isAtOneGivenPosition(String pos1, String pos2 )
	{
		boolean rval = false;
		String currentpos = getPosition();
		if (currentpos.equals(pos1))
			rval = true;
		if (currentpos.equals(pos2))
			rval = true;
		
		return rval;
	}
	public void movetoSameslot (Vic tom)
	{
		String homepos = getPosition();
		
		while(seesSlot())
		{
			if(seesCD())
			{
				if(!tom.seesCD())
				{
					takeCD();
					tom.putCD();
				}
			}
			moveOn();
			tom.moveOn();
		}
		while(!homepos.equals(getPosition()))
		{
			backUp();
			tom.backUp();
		}
	}

}
import uw.syp.java.tools.Vic;

public class VicPlus extends Vic
{
	public boolean canTakeCD()
	{
		if (seesSlot())
		{
			if( seesCD())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
			return false;
		
	}
	public boolean hasNoSlot()
	{
		if (!seesSlot())
			return false;
		else
			return true;
	}
	public boolean takingCD()
	{
		boolean rval = false;
		if (seesSlot() && seesCD())
		{
			rval = true;
		}
		
		return rval;

		
	}
	public boolean canPutCD()
	{
		boolean rval = false;
		if (seesSlot() && !seesCD())
		{
			rval = true;
		}
		return rval;
	}
	public boolean seesTwoCD()
	{
		if (seesSlot())
		{
			if ( seesCD())
			{
				moveOn();
				if (seesSlot())
				{
					if (seesCD())
					{
						return true;
					}
					else 
						return false;
				}
				else 
					return false;
			}
			else
				return false;
		}
		else
			return false;
	}
	
}
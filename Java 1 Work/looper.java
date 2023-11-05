import uw.syp.java.tools.Vic;

public class looper extends Vic
{
	public void fillSlots()
	{
		String savePos = getPosition();
		while (seesSlot())
		{
			if (!seesCD())
			{	putCD();
				moveOn();
			}
		}
		backUpTo(savePos);
	}
	private void backUpTo( String pos)
	{
		while(!pos.equals(getPosition()) )
			backUp();
	}
	public void clearSlotsToStack()
	{
		String pos = getPosition();
		while ( seesSlot() )
		{
			takeCD();
			moveOn();
		}
		backUpTo( pos );
	}
	public void fillOddSlots()
	{
		String pos = getPosition();
		while ( seesSlot() && stackHasCD() )
		{
			putCD();
			moveOn();
			if ( seesSlot() )
				moveOn();
		}
		backUpTo( pos );
	}
	public boolean seesAllFilled()
	{
		String pos = getPosition();
		while ( seesSlot() && seesCD() )
			moveOn();
    
		boolean rval = !seesSlot();
		backUpTo( pos );
		return rval;
	}
	private void filOddSlots()
	{
		
		while ( seesSlot() && stackHasCD() )
		{
			putCD();
			moveOn();
			if ( seesSlot() )
				moveOn();
		}
		
	}
	public void fillEvenSlots()
	{
		String pos = getPosition();
		moveOn();
		fillOddSlots();
		backUpTo( pos );
	}
	public boolean seeOddFilled()
	{
		boolean rval = true;
		String pos = getPosition();
		boolean run = true;
		while (run )
		{
			if(seesSlot() && !seesCD())
			{
				rval = false;
			}
			if ( seesSlot() && seesCD()  )
			{
				moveOn();
				rval = true;			
				
			}
			
			if (!seesSlot())
			{
				run = false;
			}
			
			
			
		
			
			moveOn();
		}

		
		backUpTo( pos );
		return rval;
	}


}
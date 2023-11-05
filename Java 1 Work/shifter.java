import uw.syp.java.tools.Vic;

public class Shifter extends Vic
{
     // If possible, shift the CD in slot 3 to slot 5
	public void shiftThreeToFive()
	{
    	    if ( seesSlot() ) // at position 1
    	    {
        	    moveOn(); // move to position 2
        	    if ( seesSlot() )
        	    {
            	    moveOn(); // move to position 3
            	    if ( seesSlot() )
            	    {
                	    if ( seesCD() )
                	    {
                    	    takeCD();
                    	    moveOn(); // move to position 4
                    	    if ( seesSlot() )
                    	    {
                        	        moveOn(); // move to position 5
                        	        if ( seesSlot() )
                            	        putCD();
                    	    }
                	    }
            	    }
        	    }       	 
    	    }
	}
}


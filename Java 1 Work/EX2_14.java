import uw.syp.java.tools.Vic;
public class EX2_14
{
	// Move the CDs in slots 2, 3, and 4 back to slots 1, 2, 3,
	// respectively. Presumes a reset with at least 4 slots.
	public static void main (String[ ] args)
	{ 
		Vic.reset (args); // 1
		SmartVic sue; // 2
		sue = new SmartVic(); // 3
		if ( sue.seesSlot())
		{
			sue.moveOn();
			if ( sue.seesSlot() ) 
			{
				sue.moveOn();
				if ( sue.seesSlot())
				{
					sue.moveOn();
					if( sue.seesSlot())
					{
						sue.backUp();
						sue.backUp();
						sue.backUp();
						sue.moveTake();
						sue.backPut();
						sue.moveOn(); // 6
						sue.moveTake(); // 7 move to slot 3 and take CD
						sue.backPut(); // 8 back to slot 2 and put CD there
						sue.moveOn(); // 9
						sue.moveTake(); // 10 move to slot 4 and take CD
						sue.backPut();
					}
				}
			}
		}
		
		 // 11 back to slot 3 and put CD there
	} //======================
}
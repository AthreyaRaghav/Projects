import uw.syp.java.tools.Vic;

public class Plusrunner
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		VicPlus vicky = new VicPlus();
		vicky.moveOn();
		if (vicky.hasNoSlot() )
		{
			Vic.say("Got no slot");
			
		}
		else
		{
			Vic.say("Horton hears who");
		}
	}
}
import uw.syp.java.tools.Vic;
public class notfunction
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		Vic tim = new Vic();
		tim.moveOn();
		if (!tim.seesSlot())
		{
			Vic.say("tim not see a slot");	
		}
		tim.backUp();
	}
}
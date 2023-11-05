import uw.syp.java.tools.Vic;
public class EX2_26
{
	public static void main(String[] args)
	{
		
		Vic.reset(args);
		VicPlus gary = new VicPlus();
		if (gary.canPutCD())
		{
			Vic.say("if u want i can put a cd here");
		}
		else
			Vic.say("no cd will go here");
	}
}
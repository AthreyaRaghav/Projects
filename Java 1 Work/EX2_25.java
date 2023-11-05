import uw.syp.java.tools.Vic;
public class EX2_25
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		VicPlus gary = new VicPlus();
		if (gary.takingCD())
		{
			Vic.say("idk maybe");
			
		}
		else
			Vic.say("nah");
	}
}
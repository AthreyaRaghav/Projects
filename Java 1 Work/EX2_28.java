import uw.syp.java.tools.Vic;
public class EX2_28
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		VicPlus harry = new VicPlus();
		if (harry.seesTwoCD())
		{
			Vic.say("two cd in row");
		}
		else
			Vic.say("hey");
	}
}
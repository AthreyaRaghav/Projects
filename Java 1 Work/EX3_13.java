import uw.syp.java.tools.Vic;
public class EX3_13
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		whileVic sally = new whileVic();
		if (sally.lastisFilled())
			Vic.say("last is filled");
		else
			Vic.say("saly was eatne by a caterpillar");
	}
}
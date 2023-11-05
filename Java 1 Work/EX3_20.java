import uw.syp.java.tools.Vic;
public class EX3_20
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		looper hen = new looper();
		if (hen.seeOddFilled())
		{
			Vic.say("eggscellent");
		}
		else
			Vic.say("eggstrodinary");
	}
}
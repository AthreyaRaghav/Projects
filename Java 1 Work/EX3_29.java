import uw.syp.java.tools.Vic;

public class EX3_29
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		whileVic andy = new whileVic();
		Vic alice = new Vic();
		andy.movetoSameslot(alice);
	}
}
import uw.syp.java.tools.Vic;

public class EX2_3
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		Vic bob = new Vic();
		bob.moveOn();
		bob.takeCD();
		bob.moveOn();
		bob.moveOn();
		bob.takeCD();
	}
}
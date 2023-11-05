import uw.syp.java.tools.Vic;

public class EX2_5
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		Vic tim  = new Vic();
		tim.moveOn();
		tim.takeCD();
		tim.moveOn();
		tim.takeCD();
		tim.backUp();
		tim.putCD();
		tim.moveOn();
		tim.putCD();
	}
}
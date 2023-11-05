import uw.syp.java.tools.Vic;

public class EX2_1
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		Vic tom = new Vic();
		tom.moveOn();
		tom.moveOn();
		tom.takeCD();
		tom.backUp();
		tom.backUp();
		tom.putCD();
	}
}
		
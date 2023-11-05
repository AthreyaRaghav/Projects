import uw.syp.java.tools.Vic;

public class EX2_6
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		SmartVic tin = new SmartVic();
		tin.moveOn();
		tin.moveTake();
		tin.backUp();
		tin.backPut();
	}
}
import uw.syp.java.tools.Vic;
public class EX2_7
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		SmartVic ty = new SmartVic();
		ty.moveTake();
		ty.moveOn();
		ty.moveTake();
	}
}
import uw.syp.java.tools.Vic;
public class EX2_9
{
	public static void main( String[] args)
	{
		Vic.reset(args);
		SmartVic fg = new SmartVic();
		fg.moveOn();
		fg.moveTake();
		fg.moveOn();
		fg.movePut();
	}
}
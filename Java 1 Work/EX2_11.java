import uw.syp.java.tools.Vic;
public class EX2_11
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		SmartVic jk = new SmartVic();
		jk.takeCD();
		jk.moveTake();
		jk.backPut();
		jk.movePut();
	}
}
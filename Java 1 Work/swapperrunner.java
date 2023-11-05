import uw.syp.java.tools.Vic;

public class swapperrunner
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		swapper sally = new swapper();
		sally.swapTwo();
	}
}
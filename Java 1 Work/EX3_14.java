import uw.syp.java.tools.Vic;
public class EX3_14
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		whileVic sally = new whileVic();
		whileVic fred = new whileVic();
		sally.goFirstFull();
		fred.goToFirstEmpty();
		
	}
}
import uw.syp.java.tools.Vic;

public class SmartVic extends Vic
{
	public void moveTake()
	{
		moveOn();
		takeCD();
	}
	public void backPut()
	{
		backUp();
		putCD();
	}
	public void frontSwap()
	{
		moveOn();
		takeCD();
		moveOn();
		takeCD();
		backUp();
		putCD();
		moveOn();
		putCD();
	}
	public void movePut()
	{
		moveOn();
		putCD();
	}
	public void backTake()
	{
		backUp();
		takeCD();
	}
}
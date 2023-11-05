import uw.syp.java.tools.Vic;
public class FirstVic
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		Vic tim = new Vic();
		Vic sue = new Vic();
		tim.moveOn();
		tim.moveOn();
		tim.backUp();
		//sue.moveOn();
		
		tim.takeCD();
		//sue.putCD();
		Vic.say("I mised Breakfast");
		
		
	}
}

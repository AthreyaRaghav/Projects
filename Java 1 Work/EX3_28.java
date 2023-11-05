import uw.syp.java.tools.Vic;

public class EX3_28
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		whileVic jen = new whileVic();
		
		String str1 = jen.getPosition();
		jen.moveOn();
		String str2 = jen.getPosition();
		jen.moveOn();
		if (jen.isAtOneGivenPosition(str1,str2))
			Vic.say("how");
		jen.backUp();
		if (jen.isAtOneGivenPosition(str1, str2))
			Vic.say("ok");
		jen.backUp();
		if( jen.isAtOneGivenPosition(str1, str2))
			Vic.say("x6e7dghf");
		
			
		
	}
}
import uw.syp.java.tools.Turtle;
import uw.syp.java.tools.Turtlet;
public class TodTheTurtle extends Turtle {
	public static void main(String[] args)
	{
		Turtle pokey = new Turtle();
		TodTheTurtle tod = new TodTheTurtle();
		
		pokey.paint(50, 100);
		tod.paint(-50,100);
		
		
		
	
	}
	
	public TodTheTurtle()
	{
		System.out.println("Tod the turtle is born");
		System.out.println("Rejoice");
		
	}
	
	
	
	public Turtlet paint(double angle, double distance)
	{
		say("Whatever");
		
		super.paint(angle,  distance);
		say("Happy now?");
		
		return null;
	}
	
	
	

}
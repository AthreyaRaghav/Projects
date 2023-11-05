import uw.syp.java.tools.Turtle;

public class EX1_18
{
	public static void main(String[] args)
	{
		Turtle dave = new Turtle();
		dave.switchTo( Turtle.RED);
		dave.fillCircle(80);
		dave.switchTo(Turtle.YELLOW);
		dave.fillCircle(60);
		dave.switchTo(Turtle.BLUE);
		dave.fillCircle(40);
		dave.switchTo(Turtle.BLACK);
		dave.fillCircle(20);
	}
}
import uw.syp.java.tools.Turtle;
import uw.syp.java.tools.Math;
public class smarturtle extends Turtle
{
	public void makeSmallsquare()
	{
		paint(90,10);
		paint(90,10);
		paint(90,10);
		paint(90,10);
	}
	public void makeBigSquare()
	{	paint(90,40);
		paint(90,40);
		paint(90, 40);
		paint(90,40);
	}
	public void makeHexagon()
	{
		paint(0,30);
		paint(60,30);
		paint(60,30);
		paint(60,30);
		paint(60,30);
		paint(60,30);
	}
	double rand = Math.random(50);
	double ran = Math.random(140);
	public void redCircle()
	{
		Turtle.sleep(1000);
		move(ran,rand)
		switchTo( Turtle.RED);
		fillCircle(80);
	}

}
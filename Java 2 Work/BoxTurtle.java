import java.awt.Color;

import uw.syp.java.tools.Turtle;
public class BoxTurtle extends Turtle
{
	public BoxTurtle(int side)
	{
		fillBox( side, side);
	}
	
	public BoxTurtle(Color color, int side)
	{
		switchTo(color);
		fillBox(side,side);
	}
	public BoxTurtle()
	{
	}

}

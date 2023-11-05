import uw.syp.java.tools.Turtle;
public class Second
// 7-11-22 is the current date
{
	public static void main( String[] arg)
	{
		// toots is a turtle doing turtle things
		Turtle toots;
		toots = new Turtle();
		toots.paint(45, 120);
		toots.paint(-45,240);
		toots.paint(-135,240);
		toots.move(-45,64);
		toots.paint(-90,64);
		toots.swingAround(64);
	}
}	
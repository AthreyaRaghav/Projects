public class EX1_8
{
	public static void main(String[] args)
	{
		smarturtle asd = new smarturtle();
		asd.makeBigSquare();
		//find direction: East
		//asd.paint(0,30);
		asd.move(-180,15);
		asd.move(-90, 25);
		//asd.move(90,10);
		//asd.move(-90,0);
		//get direction:North
		//asd.paint(0,10);
		asd.makeSmallsquare();
		//get direction:North
		//asd.paint(0,5);
		asd.move(-90,25);
		asd.move(-90,25);
		asd.makeBigSquare();
		asd.move(-180,15);
		asd.move(-90, 25);
		asd.makeSmallsquare();
	}
}
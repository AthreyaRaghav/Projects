public class EX1_11
{
	public static void main(String[] args)
	{
		smarturtle neb = new smarturtle();
		neb.makeHexagon();
		neb.move(60,30);
		neb.move(-60,0);
		neb.makeHexagon();
		neb.move(180,0);
		neb.move(0,30);
		neb.move(60,30);
		neb.move(180,0);
		neb.makeHexagon();
		
	}
}
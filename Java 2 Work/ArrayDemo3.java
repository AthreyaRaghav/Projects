import uw.syp.java.tools.Turtle;
public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Turtle[] turtles = 
			{
					new Turtle(),
					new Turtle(),
					new Turtle(),
					new Turtle(),
					new Turtle(),
					new Turtle(),
			};
		System.out.println("# Turtles = " + turtles.length );
		
		for (int inx = 0 ; inx < turtles.length ; ++inx)
		{
			Turtle pokey = turtles[inx];
			pokey.move(90, inx*30);
			pokey.paint(-45, 128);
		}

	}

}

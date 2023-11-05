import uw.syp.java.tools.Turtle;
import uw.syp.java.tools.Turtlet;
public class EX7slide10_1 {
	
	public static void main(String[] args)
	{
		/*
		double[] dArr = 
			{1.5,1.4,4.6,5.7,3.3,1.69,1.96,2.89,3.61,6.4};
		for (int inx = 0; inx < dArr.length; inx++ )
		{
			String message = 
					"The Square root of " + dArr[inx]
							+ " is " + Math.sqrt(dArr[inx]);
			System.out.println(message);
		}
		*/
		
		
		/*
		double[] dArr = 
			{1.5,1.4,4.6,5.7,3.3,1.69,1.96,2.89,3.61,6.4};
		Ex7slide10_2 hi = new Ex7slide10_2();
		System.out.println(hi.findLargest(dArr));
	*/
		
		Turtle[] henry = new Turtle[10];
		java.awt.Color[] colors = {
				Turtle.BLACK,
				Turtle.BLUE,
				Turtle.GRAY,
				Turtle.MAGENTA,
				Turtle.ORANGE,
				Turtle.PINK,
				Turtle.RED,
				Turtle.WHITE,
				Turtle.YELLOW,
				Turtle.GREEN,
		};
		
		for( int inx = 0 ; inx < henry.length ; inx++ )
		{
			
			henry[inx] = new Turtle();
			henry[inx].switchTo(colors[inx]);
			henry[inx].paint(inx*20, (inx+1)*25);
		}
		
		
	}
	
	
	
	


}

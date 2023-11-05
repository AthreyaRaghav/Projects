import uw.syp.java.tools.Turtle;
public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Turtle[] objArray = new Turtle[17];
		
		for (int inx = 0; inx <objArray.length; ++inx)
			objArray[inx] = new Turtle();
		objArray[0].switchTo(Turtle.RED);
		objArray[2].fillBox(43, 25);
		objArray[0].paint(1000, 0);

	}

}

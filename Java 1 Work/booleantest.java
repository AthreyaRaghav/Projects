public class booleantest
{
	public static void main(String[] args)
	{
		Turtleplus timmy = new Turtleplus();
		if (timmy.areYouATurtle()){
			timmy.swingAround(64);
			timmy.paint(45,32);
			timmy.say("I knew it");
		}
		timmy.move(0,64);
		timmy.fillBox(128,64);
	}

}
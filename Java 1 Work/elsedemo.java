public class elsedemo
{
	public static void main(String[] args)
	{
		Turtleplus sid = new Turtleplus();
		if (sid.areYouARabbit())
		
			sid.say("yes, I am a turtle");
		else
			sid.say("no, I am not a turtle");
		sid.fillCircle(12);
	}
}
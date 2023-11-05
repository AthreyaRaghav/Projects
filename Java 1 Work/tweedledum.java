public class tweedledum
{
	public static void main( String[] args)
	{
		System.out.println("I am Tweedle Dum. Who are you?");
		tweedledee dee = new tweedledee();
		dee.printName();
	}
	public static void printName()
	{
		System.out.println("I am Tweedle Dum.");
	}
}
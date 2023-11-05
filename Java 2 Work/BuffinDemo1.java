import uw.syp.java.tools.Buffin;

public class BuffinDemo1 {

	public static void main(String[] args) {
		
		

	}
	
	private void boilerPlateExample()
	{
		Buffin buffReader = new Buffin("E:/java 2 Work/Workers.txt");
		if ( buffReader.isStdIn())
		{
			System.err.print("can't find Workers.txt");
			System.exit(1);
		}
		String line = buffReader.readLine();
		while(line != null)
		{
			System.out.println(line);
			
			line = buffReader.readLine();
		}
	}
	buffReader.close();

}

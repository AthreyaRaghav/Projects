import uw.syp.java.tools.Buffin;

public class mod7slide27eX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buffin buffReader = new Buffin("E:/java 2 Work/Workers.txt");
		if ( buffReader.isStdIn() )
		{
			System.out.println("Can'tFind Workers.txt");
			System.exit(1);
		}
		String line = buffReader.readLine();
		for(int inx = 0; inx < 3 && line != null ; ++inx)
		{
			System.out.println(line);
			line = buffReader.readLine();
			
		}

	}

}

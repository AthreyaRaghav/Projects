import uw.syp.java.tools.Buffin;

public class BuffinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffin buff = new Buffin( "Workers.txt" );
		if (buff.isStdIn())
		{
			System.out.println("Workers.txt not found");
			System.exit(1);
			
		}
		
		String line;
		while( (line = buff.readLine() ) !=null )
			System.out.println(line);

	}

}

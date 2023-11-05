import java.util.StringTokenizer;
public class StringTokenizerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	private static void parse(String toParse, String delims)
	{
		StringTokenizer tizer = new StringTokenizer( toParse, delims );
		int              counter = 0;
		System.out.println("#tokens: " + tizer.countTokens());
		while (tizer.hasMoreTokens())
		{
			String token = tizer.nextToken();
			System.out.println(++counter + "." + token );
			
		}
	}

}

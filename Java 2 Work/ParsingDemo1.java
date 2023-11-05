import java.util.StringTokenizer;


public class ParsingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String toParse = "3.1,5.7;-1.3 -6.2";
		StringTokenizer tizer = new StringTokenizer(toParse, ",; ");
		while(tizer.hasMoreTokens())
			System.out.println(tizer.nextToken());

	}

}

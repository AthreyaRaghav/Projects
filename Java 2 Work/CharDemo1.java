
public class CharDemo1 {

	public static void main(String[] args) {
		char cVar = 'a';
		while(cVar <= 'z')
		{
			System.out.println((int)cVar);
			cVar++;
		}
		System.out.println();
		for ( int inx  = 97; inx < 123; ++inx)
		{
			System.out.print((char)inx);
		}
	}

}

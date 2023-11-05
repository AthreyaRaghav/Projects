
public class SubstringDemo1 {

	public static void main(String[] args) {
		String test = "0123456789";
		// up to but Not including 7 (3-7) exclusive
		System.out.println(test.substring(3,7));
		// 3 to the end of the string
		System.out.println(test.substring(7));

	}

}

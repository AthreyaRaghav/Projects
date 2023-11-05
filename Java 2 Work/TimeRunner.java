
public class TimeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 23;
		int y = 5;
		System.out.println("x"+(x + y));
		
		TimeClass t4 = new TimeClass(13,5);
		System.out.println(t4.toString());
		TimeClass t3 = new TimeClass(13,5);
		t4.add(t3);
		System.out.println(t4.add(t3));
	

	}

}

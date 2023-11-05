import java.util.Random;
public class RandomeDemo1 {

	public static void main(String[] args) {
		
		Random randy = new Random();
		for (int inc = 0 ; inc < 10; ++inc)
		{
			System.out.println(randy.nextInt(100));
		}

	}

}

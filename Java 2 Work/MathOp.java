
public class MathOp {
	private MathOp(){
		
	}
	
	public static double average(double sum, int count)
	{
		double rval = sum/count;
		return rval;
	}
	
	public static int powerOf2Alt(int expo)
	{
		int rval =1;
	 
		for (;expo > 0;--expo)
			rval = rval*2;
		return rval;
	}
	
	public static int powerOf2(int expo)
	{
		int rval =1;
		for (int inx = 0; inx <expo; ++inx)
			rval = rval*2;
		return rval;
	}
	
	public static double Circumference(double radius)
	{
		double x =radius*2;
		double pi = 3.14159626;
		double circumference = x*pi;
		return circumference;
		
	}
	
	public static double Area(double radius)
	{
		double squared_radius = radius*radius;
		double pi = 3.14159626;
		double Area = squared_radius * pi;
		return Area;
		
				
	}

}

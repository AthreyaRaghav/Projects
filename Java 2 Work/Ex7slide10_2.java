
public class Ex7slide10_2 {
	
	double findLargest(double[] Darray)
	{
		double Largest = Darray[0];
		for (int inx = 0; inx < Darray.length; inx++)
		{
			if (Darray[inx]>Largest)
				Largest = Darray[inx];
			
		}
		return Largest;
		
	}

}

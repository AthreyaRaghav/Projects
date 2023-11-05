import uw.syp.java.tools.Vic;

public class IfDemo
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		Vic tim = new Vic();
		System.out.println("starting");
		if (tim.seesSlot())
		{
			if ( tim.seesCD())
			{
				System.out.println("sees CD in slot 1");
				tim.takeCD();
			}
			tim.moveOn();
			System.out.println("moving on (1)");
			if (tim.seesSlot())
			{	
				if ( tim.seesCD())
				{
					System.out.println("sees CD in slot 1");
					tim.takeCD();
				}
				tim.moveOn();
				System.out.println("moving on (2)");
				if ( tim.seesSlot())
				{
					if ( tim.seesCD())
					{
						System.out.println("sees CD in slot 1");
						tim.takeCD();
					}
					tim.moveOn();
					System.out.println("moving On (3)");
					
				}
			}
		}
	}
}
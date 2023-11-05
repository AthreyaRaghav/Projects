import uw.syp.java.tools.Vic;
public class EX2_15
{
	public static void main(String[] args)
	{
		Vic.reset(args);
		Vic guy = new Vic();
		if ( guy.seesSlot() )
		{
			guy.moveOn();
			if ( guy.seesSlot() ) 
			{
				guy.moveOn();
				if (guy.seesSlot())
				{
					guy.moveOn();
					if (guy.seesSlot())
					{
						guy.moveOn();
						if (guy.seesSlot())
						{
							if (guy.seesCD())
							{
								guy.takeCD();
								guy.moveOn();
								if(guy.seesSlot())
								{
									guy.moveOn();
									if (guy.seesSlot())
									{
										if (guy.seesCD())
										{
											guy.takeCD();
											guy.backUp();
											guy.backUp();
											guy.putCD();
											guy.moveOn();
											guy.moveOn();
											guy.putCD();
											
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
	}
	
}
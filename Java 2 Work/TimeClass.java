import java.sql.Time;

public class TimeClass 
{
	
	private int hour;
	private int min;
	
	public TimeClass(int hour, int min)
	{
		this.hour = hour;
		this.min = min;
	}
	
	public TimeClass( TimeClass toCopy )
	{
		
		hour = toCopy.hour;
		min = toCopy.min;
		
	}
	@Override
	public String toString()
	{
		String time = "";
		if (min<10)
			time = time + hour + "0";
		else
			time = time + hour;
		if (hour<10)
			time = "0" + time;
		time =  time+ min;
		return time;
	}
	public TimeClass add(TimeClass t3)
	{
		int newHour = this.hour + hour;
		int newMin = this.min + min;
		while(newMin >= 60)
		{
			newMin  -= 60;
			newHour += 1;
		}
		while(newHour > 23)
			newHour-=24;
		TimeClass result = new TimeClass(newHour,newMin);
		return result;
	}

}

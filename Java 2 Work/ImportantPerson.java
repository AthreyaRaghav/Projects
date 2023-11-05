
public class ImportantPerson extends Person


{
	private String birthday = "";
	
	public ImportantPerson()
	{
		birthday = "none";
	}
	public ImportantPerson( String first, String last )
	{
		super( first, last );
		birthday = "none";
	}
	public String toString()
	{
	   	String  rval	= super.toString() + ": " + birthday;
	   	return rval;
	}
	
	public String getBirthday()
	{
		 return birthday;
		 
				
		
	}
	
	public void setBirthday(String name)
	{
		birthday = name;
	}
	
	public void setName(String First,String Last, String Birthday)
	{
		this.setName(First, Last);
		birthday = Birthday;
	}




}

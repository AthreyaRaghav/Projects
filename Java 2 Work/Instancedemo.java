
public class Instancedemo {


	private String FirstName = "";
	private String Lastname = "";
	private String Title = "";

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getFirstName()
	{
		return FirstName;
		
	}
	
	public void setFirstName(String name)
	{
		FirstName = name;
	}
	
	public String getLastname()
	{
		return Lastname;
	}
	
	public void setLastName(String name)
	{
		Lastname = name;
	}
	
	public String toString()
	{
		String person =
				Lastname + FirstName + Title;
		return person;
		
	
	}
}



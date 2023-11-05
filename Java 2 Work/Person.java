public class Person
{
	private String firstName;
	private String lastName;
	
	public Person()
	{
	    firstName = "none";
	    lastName = "none";
	}
	public Person( String first, String last )
	{
		firstName = first;
		lastName = last;
	}
	public void setFirstName( String name )
	{
		firstName = name;
	}

	public String getFirstName()
	{
		return firstName;
	}
	public String toString()
	{
		String  rval	= lastName + ", " + firstName;
		return rval;
	}
	
	public void setLastName(String name)
	{
		lastName = name;
	
	}
	
	public String getLastName()
	{
		return lastName;
	}
	public void setName(String First, String last)
	{
		firstName = First;
		lastName = last;
	}






}


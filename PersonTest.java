import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PersonTest 
{
	private Person object1;
	private Person object2;
	
	@Before
	public void setup()
	{
		object1=new Person("Ram",5,6,1980);
		object2=new Person("Shyam",2,3,1987);
	}
	@Test
	public void display12()
	{
		System.out.println(object1.display());
		System.out.println(object2.display());
	}
	@Test
	public void display() 
	{
		System.out.println(object1.display1(object2));
	
	}
}
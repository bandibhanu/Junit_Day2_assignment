import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTestCase {
private Vehicle object1;
private Vehicle object2;
	
	@Before
	public void setup()
	{    
		object1=new Vehicle("bhanu",45,55,656,230,1);
	
		object2=new Vehicle();
		
	}
	@Test
	public void direction()
	{
		int expectDirection=55;
		assertEquals(expectDirection,object1.getSetDirection());
		System.out.println("Direction  "+object1.getSetDirection());
	}
	
	@Test
	public void name() 
	{	
		String expectedName="bhanu";	
		
		assertEquals(expectedName, object1.getSetName());
		System.out.println("name  :"+object1.getSetName());
	}
	
	@Test
	public void ownerName()
	{
		Vehicle object3=new Vehicle("bhanu");
		String expected="bhanu";
		assertEquals(expected,object3.getOwnerName());
		System.out.println("Owner Name :"+object3.getOwnerName());
	}
	
	@Test
	public void currentSpeed() 
	{	
		int expectSpeed=45;
		assertEquals(expectSpeed,object1.getSetCurrentSpeed());
		System.out.println("current Speed  "+object1.getSetCurrentSpeed());
	}
	@Test
	public void Id(){
		int expected=656;
		int actual=object1.getIDNumber();
		assertEquals(expected, actual);
		System.out.println("IDNumber  :"+actual);
	}
	@Test
	public void changeSpeed()
	{
		int expected=66;
		int changeSpeedValue=object1.changeSpeed(21);	
		assertEquals(expected, changeSpeedValue);
		System.out.println("change Speed= "+changeSpeedValue);
		
	}
	@Test
	public void setSpeedToZero()
	{
		int expected=0;
		Vehicle object4=new Vehicle();
		int actual=object4.speedToZero();
		assertEquals(expected, actual);
		System.out.println("setSpeedToZero="+actual);
	}
	@Test
	public void Test()
	{   int expected=1;
		int actual=0;
		String actualString=object1.sendingLeftRight();
		System.out.println("direction=="+actualString);
		String expectedString="leftnortheast";
		if(actualString.equals(expectedString))
		{
			actual=1;
		}
		assertEquals(expected, actual);
		
	}
}

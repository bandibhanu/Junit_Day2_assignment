import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CountryTest {
	private Country object1;
	private Country object2;
	private Country object3;
	//private Country object4;
	public Country[] countryArray=new Country[4];
	@Before
	public void setup()
	{
		object1= new Country("India",2000,1435);
		object2= new Country("USA",1232,1222);
		object3= new Country("Australia",2312,3211);
		//object4= new Country("Singapoor",1111,212);
		countryArray[0]=object1;
		countryArray[1]=object2;
		countryArray[2]=object3;
		//countryArray[3]=object4;
	
	}

	
	@Test
	public void LargestArea() 
	{
	int actual1=2312;
	int actual2=3211;
	double actual3=1.0;
	int expected1=object1.first(object1,object2,object3);
	int expected2=object1.area(object1,object2,object3);
	double expected3=object1.dencityPopulation(object1,object2,object3);
	if(expected1==2312)
	{
		System.out.println("country is Austarlia");
	}
	if(expected2==3211)
	{
		System.out.println("country is USA");
	}
	if(expected3==1.0)
	{
		System.out.println("country is India");
	}
	assertEquals(expected1, actual1);
    assertEquals(expected2, actual2);
	assertEquals(expected3, actual3,2);
	
	
	}

}

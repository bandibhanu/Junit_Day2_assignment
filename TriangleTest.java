import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {

	@Test
	public void equlateral()
	{	
		Triangle object1=new Triangle(5,5,5);
		boolean actual=true;
		boolean expected=object1.equilateral();
		assertEquals(expected, actual);	
	}
	@Test
	public void  scalanceTriangle()
	{	
		Triangle object1=new Triangle(3,4,5);
		boolean actual=true;
		boolean expected=object1.scalanceTriangle();
		assertEquals(expected, actual);	
		
	}
	@Test
	public void isoscelesTriangle()
	{
		Triangle object1=new Triangle(4,4,5);
		boolean actual=true;
		boolean expected=object1.isoscelesTriangle();
		assertEquals(expected, actual);	
		
	}
	@Test
	public void rightAngledTriangle()
	{
		Triangle object1=new Triangle(3,4,5);
		boolean actual=true;
		boolean expected=object1.rightAngledTriangle();
		assertEquals(expected, actual);	

	}
}

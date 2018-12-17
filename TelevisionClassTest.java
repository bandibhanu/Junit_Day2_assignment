import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TelevisionClassTest {
private Television object;
	@Before
	public void test() 
	{
		
	       object=new Television(true,100);
	}
	@Test
	public void currentState()
	{
		boolean actual=true;
		boolean expected=object.switchOnOffMethod(true);
		assertEquals(expected, actual);	
	}
	@Test
	public void channel()
	{
		int actual=34;
		int expected=object.currentChannelNumber(34);
		assertEquals(expected, actual);
	}
	@Test
	public void volumeIncrease()
	{
		int actual=77;
		int expected=object.currentVolume(76);
		assertEquals(expected, actual);
	}
	@Test
	public void volumeDecrease()
	{
		int actual=41;
		int expected=object.currentDecrease(42);
		assertEquals(expected, actual);
	}



}

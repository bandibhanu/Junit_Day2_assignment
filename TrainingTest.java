import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TrainingTest {
private Training object;
private Training object2;


	@Before
	public void test() {
		object=new PublicTraining(34,"bhanu",-3,3);
		object2=new CorporateTraining(323,"shabzan",-44,7);
		//fail("Not yet implemented");
	}
	@Test
	public void test2()
	{   
		double i;
		try {
			i = object.getOrderValue();
			System.out.println(i);
		} catch (InvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Test
	public void test3()
	{
		double i;
	    try {
			i=object2.getOrderValue();
			System.out.println(i);
		} catch (InvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}

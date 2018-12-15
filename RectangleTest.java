import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest 
	{
    private RectangleClass object;
    private RectangleClass object1;
    
    @Before
    public void setup()
    {
    	object=new RectangleClass(5,7);
    	object1=new RectangleClass(5,7);
    	
    }
    @Test
    public void perimeter()
    {
    	double perimeter1=object.perimeter();
    	System.out.println(perimeter1);
    	double perimeter2=object.perimeter();
    	System.out.println(perimeter2);
    }
	@Test
	public void test() {
		double area=object.rectangleOne();
		System.out.println(area);
		double area1=object1.rectangleOne();
		System.out.println(area1);
		assertEqual(area,area1);
	}
	private void assertEqual(double area, double area1) {
		// TODO Auto-generated method stub
		
	}
}
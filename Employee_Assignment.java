import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Employee_Assignment {
private EmployeeAssign object;
 	@Before
 	public void setup()
 	{	
 		
 		object=new EmployeeAssign(100,"bhanu",1000);
 		EmployeeAssign.setPfRate(10);

 	}
 	

 		@Test
		public void getAnnualBasic()
 		{
		int AnnualBasic=object.getAnnualBasic();
		assertEquals(12000,AnnualBasic);
 		}
		@Test
		public void monthlyGrossSalary11()
		{
		int monthlyGrossSalary=object.getMonthlyGrossSalary();
		assertEquals(9050,monthlyGrossSalary);
		}
		@Test
		public void annualGrossSalary1()
		{
	    int annualGrossSalary=object.getAnnualGrossSalary();
	    assertEquals(108600,annualGrossSalary);
		}
		@Test
		public void monthlydeduction1()
		{
	    int monthlydeduction=object.getMonthlyDeductions();
	    assertEquals(6550,monthlydeduction);
		
		}
		@Test
		public void MonthlyTakeHome1()
		{

	    int MonthlyTakeHome=object.getMonthlyTakeHome();
	    assertEquals( 2500,MonthlyTakeHome);
		}
		@Test
		public void AnnualTakeHome1()
		{
	    int AnnualTakeHome=object.getAnnualTakeHome();
	    assertEquals(30000, AnnualTakeHome);
		}
		//assertEquals(monthlyGrossSalary,108600);
		
	
	
	
	
}

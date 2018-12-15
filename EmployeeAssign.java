
public class EmployeeAssign {
     private int id1;
     private String name1;
     private int monthlyBasic1;
     private static int pfRate;

	public EmployeeAssign(int id, String name,int monthlyBasic) {
		// TODO Auto-generated method stub
		this.id1=id;
		this.name1=name;
		this.monthlyBasic1=monthlyBasic;
		
		
	}
	public static int getPfRate() 
	{
		return pfRate;
	}
	
	public static void setPfRate(int pfRate)
	{
		EmployeeAssign.pfRate = pfRate;
	}
	
	int	getAnnualBasic() 
		{
		
		//System.out.println(id1);
			return (12*monthlyBasic1);
					}
	int hra()
	{
		return (int) ((12*monthlyBasic1)*0.50);
		
	}
	int madical()
	{
		return 1250;
	}
	int conveyance_allowance()
	{
		return(800);
	}
	int pf()
	{
    int checkPf=(int) EmployeeAssign.getPfRate()/100*(getAnnualBasic());
    if(checkPf<=6500)
    {
    	return(6500);
    }
    else
    {
    	return(checkPf);
    }
	}
	int esic()
	{
		if(getAnnualBasic()<=5000)
		{
			return((int)(0.0475)*getAnnualBasic());
		}
		else
		{
			return 0;
		}
	}
	int profTax()
	{
		if(getMonthlyGrossSalary()<=10000)
		{
			return(50);
		}
		else
		{
			return 100;
		}
	}
	int getMonthlyGrossSalary()
    {
		
		//System.out.println(monthlyBasic1+hra()+madical()+conveyance_allowance());
		return (monthlyBasic1+hra()+madical()+conveyance_allowance());
	}
	int getAnnualGrossSalary() 
	{	//System.out.println(12 * getMonthlyGrossSalary());
	return (12 * getMonthlyGrossSalary());
		//return(12 * getMonthlyGrossSalary());
	}
	int getMonthlyDeductions()
	{    System.out.println(pf() + esic() + profTax());
		//System.out.println(pf() + esic() + profTax());
		return(pf() + esic() + profTax());
	}
	int getMonthlyTakeHome() 
	{
		//System.out.println(getMonthlyGrossSalary()- getMonthlyDeductions());	
		return(getMonthlyGrossSalary()- getMonthlyDeductions());
	}
	int getAnnualTakeHome() 
	{   
		//System.out.println(12 * getMonthlyTakeHome());
		return(12 * getMonthlyTakeHome());
	}
}
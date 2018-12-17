
public class Triangle 
{
private int side1;
private int side2;
private int side3;

	public Triangle(int side1, int side2, int side3)
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		
	}

	public boolean equilateral() 
	{
		if((side1==side2)&&(side2==side3)&&(side3==side1))
		{
			return true;
	    }
		else
		{
			return false;
		}
		}

	public boolean scalanceTriangle() 
	{
		if((side1!=side2)&&(side2!=side3)&&(side3!=side1))
		{
		return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isoscelesTriangle() 
	{
	if((side1==side2)||(side2==side3)||(side3==side1))
	{
		return true;
	}
	else
	{
		return false;
	}

	}
	public boolean rightAngledTriangle() 
	{
		int side11=(int)Math.pow(side1 ,2);
		int side22=(int)Math.pow(side2 ,2);
		int side33=(int)Math.pow(side3 ,2);
	if(((side11+side22)==side33)||((side22+side33)==side11)||((side33+side11)==side22))
	{
		return true;
	}
	else
	{
		return false;
	}

	}
	
}

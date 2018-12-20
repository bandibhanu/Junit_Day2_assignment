
public class Vehicle 
{
	private int increasedSpeed;
	private int IDNumber;
	private int left;
	private int right;
	private int speedSetToZero;
	private String setName;
	private int setDirection;
	private int setCurrentSpeed;
	private String ownerName;
	private int degree;
	private int side;
	public static int highestVehicleId=9999;
	
	public int getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(int iDNumber) {
		IDNumber = iDNumber;
	}
	
	public String getSetName() {
		return setName;
	}

	public void setSetName(String setName) {
		this.setName = setName;
	}

	public int getSetDirection() {
		return setDirection;
	}

	public void setSetDirection(int setDirection) {
		this.setDirection = setDirection;
	}

	public int getSetCurrentSpeed() {
		return setCurrentSpeed;
	}

	public void setSetCurrentSpeed(int setCurrentSpeed) {
		this.setCurrentSpeed = setCurrentSpeed;
	}
	public Vehicle(String name)
	{
		this.ownerName=name;
		
	}
	
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getIncreasedSpeed() {
		return increasedSpeed;
	}

	public void setIncreasedSpeed(int increasedSpeed) {
		this.increasedSpeed = increasedSpeed;
	}
	public int speedToZero() {
		
		return this.speedSetToZero=0;
		
	}
	public Vehicle()
	{}
	public Vehicle(String ownerName, int currentSpeed, int currentDirection,int Id,int angle,int side)
	{   this.degree=angle;
		this.side=side;
		this.IDNumber=Id;
		this.setName=ownerName;
		this.setDirection=currentDirection;
		this.setCurrentSpeed=currentSpeed;
	}
	
	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
		
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int changeSpeed(int speedIncrease)
	{
		
		return this.increasedSpeed=speedIncrease+getSetCurrentSpeed();
		
	}
	

	
	public int numberId()
	{
		if(getIDNumber()<highestVehicleId)
		{
			return(getIDNumber());
		}else
		{	
		return 0;
		}
	}

	

	public String sendingLeftRight()
	{	//int initial=0;
		
		
		int totalAngle=getDegree();
		System.out.println("total angle="+totalAngle);
		if(getSide()==1)       //1 is left side
		{
			if((totalAngle<90)&&(totalAngle>0))
			{
				return "leftnortheast";
			}
		    else if(totalAngle==0 || totalAngle==360)
		    {
		    	return "lefteast";
		    }
			else if(totalAngle==90)
			{
				return "leftnorth";
			}
			else if((totalAngle<180)&&(totalAngle>90))
			{
				return "leftnothwest";
			}
			else if(totalAngle==180)
			{
				return "leftwest";
			}
			else if((totalAngle>180)&&(totalAngle<270))
			{
				return "leftsouthwest";
			}
			else if(totalAngle==270)
			{
				return "leftsouth";
			}
			else if((totalAngle>270)&&(totalAngle<360))
			{
				return "leftsoutheast";
			}
			return "outofbond";
		}
		else
		{
			if((totalAngle<90)&&(totalAngle>0))
			{
				return "rightsoutheast";
			}
			else if(totalAngle==0 || totalAngle==360)
			{
				return "righteast";
			}
			else if(totalAngle==90)
			{
				return "rightsouth";
			}
			else if((totalAngle<180)&&(totalAngle>90))
			{
				return "rightsouthwest";
			}
			else if(totalAngle==180)
			{
				return "rightwest";
			}
			else if((totalAngle>180)&&(totalAngle<270))
			{
				return "rightnorthwest";
			}
			else if(totalAngle==270)
			{
				return "rightnorth";
			}
			else if((totalAngle>270)&&(totalAngle<360))
			{
				return "rightnortheast";
			}
		}
	return "outofbond";
	}


	@Override
	public String toString() {
		return "Vehicle [increasedSpeed=" + increasedSpeed + ", setName="
				+ setName + ", setDirection=" + setDirection
				+ ", setCurrentSpeed=" + setCurrentSpeed + ", ownerName="
				+ ownerName + "]";
	}

	
	
}
	
	



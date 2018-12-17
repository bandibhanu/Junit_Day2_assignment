
public class Television 
{
	boolean switchOnOff;
	int maximumChannels;
	public Television(boolean switchOnOff, int maximumChannels)
	{
		this.switchOnOff=switchOnOff;
		this.maximumChannels=maximumChannels;
	 	 
	}
 
	public boolean switchOnOffMethod(boolean input) 
	{
		if(input==true)
		{	
			System.out.println("Status on");
			return true;
		}
		else
		{
			System.out.println("Status off");
			return false;
		}
	
	}

	public int currentChannelNumber(int channelNumber) 
	{
		if(switchOnOff==true&&channelNumber<maximumChannels)
		{
			System.out.println("channelNumber="+channelNumber);
			return channelNumber;
		}
		else
		{
			return 00;
		}
	}

	public int currentVolume(int volume)
	{
		if(switchOnOff==true)
		{
			System.out.println("initial volume is "+volume);
			System.out.println("volume is increased to "+(volume+1));
			return(volume+1);
		}
		else
		{
			return(0);
		}
		
	}

	public int currentDecrease(int volumeDecrease) 
	{
		if(switchOnOff==true)
		{
			System.out.println("volume is decreased to "+(volumeDecrease-1));
			return(volumeDecrease-1);
		}
		else
		{
			return(0);
		}
	}
	
}


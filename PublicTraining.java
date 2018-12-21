
public class PublicTraining extends Training {
	private int participants;




	/*public PublicTraining(int Id, String subject, double fees) {
		super(Id, subject, fees);
		// TODO Auto-generated constructor stub
	}
*/



	
	public PublicTraining(int Id, String subject, double fees,int participants)
	{
		super(Id, subject, fees);
		this.participants=participants;
		// TODO Auto-generated constructor stub
	}

	
	

	public double getOrderValue() throws InvalidException
	{
		if(fees>0)
	{
		double y=fees*participants;
		return y;
	}
	else
	{
		throw new InvalidException ("poor ra howly");
	}
	}

}


public class CorporateTraining extends Training {
private int days;
	public CorporateTraining(int Id, String subject, double fees,int days) {
		super(Id, subject, fees);
		this.days=days;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getOrderValue() throws InvalidException {
		if(fees>0)
		{
		// TODO Auto-generated method stub
		
		return days*fees;
		}
		else
		{
			throw new InvalidException("given negative value");
			
		}
		}

}

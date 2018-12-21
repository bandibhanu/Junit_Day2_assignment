
public abstract class Training {
private int Id;
private String subject;
public double fees;

public Training(int Id,String subject,double fees )
{
	this.Id=Id;
	this.subject=subject;
	this.fees=fees;
}

public int getId() {
	return Id;
}
public void setId(int id1) {
	Id = id1;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}


public abstract double getOrderValue() throws InvalidException;
}

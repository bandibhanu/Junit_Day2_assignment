
//PESON PROGRAM TO PRINT THE AGES OF TWO PERSON AND 

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Person {

private String name;
private Date dob;
	public Person(String name, int d,int m,int y)            
	
	{
		 dob=new Date();
		 this.name=name;                                       //INITIALIZING THE VALUES
	     this.dob.setDate(d);
	     this.dob.setMonth(m);
	     this.dob.setYear(y);
	   
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String display() 
	{
		String message = "";
		LocalDate toDay = LocalDate.now();                       //FOR	PRESENT DATE
		int year=toDay.getYear();
		int month=toDay.getMonthValue();
		
		message += "Name: "+name+"\n";
		message += "date of birth : "+dob.getDate()+"/"+dob.getMonth()+"/"+dob.getYear()+"\n";
		message += "age:"+(year-dob.getYear())+" years,"+(month-dob.getMonth())+" months,"+(30-dob.getDate())+" days";
	                                                             //PRINTING THE VALUES 
		/*System.out.println("Name:"+name);
		System.out.println("date of birth : "+dob.getDate()+"/"+dob.getMonth()+"/"+dob.getYear());
		System.out.println("age:"+(year-dob.getYear())+" years,"+(month-dob.getMonth())+" months,"+(30-dob.getDate())+" days");
		System.out.println("\n");*/
		return message;                                       
				
	
}
	public String display1(Person object2)
	{ 	
		String message = "";
		String olderName = "";
		String youngerName = "";
		int x=0;
		int y=0;
		int z=0;
		  LocalDate toDay = LocalDate.now();
			int year=toDay.getYear();
			int month=toDay.getMonthValue();
		
		
		int yearOfPerson1=dob.getYear();
		int monthOfPerson1=dob.getMonth();
		int dayOfPerson1=dob.getDate();
		int yearOfPerson2=object2.dob.getYear();                 
		int monthOfPerson2=object2.dob.getMonth();
		int dayOfPerson2=object2.dob.getDate();
		if((((year-(object2.dob.getYear()))*365)+(object2.dob.getMonth()*30)+(object2.dob.getDate())>(((year-(dob.getYear()))*365)+(dob.getMonth()*30)+(dob.getDate()))))
       
		                                                               //TO FINFING THE OLDER AGE PERSON
		{   
			olderName += getName();
			youngerName += object2.getName();
			if(dayOfPerson1<dayOfPerson2)
			{
				 x=(dayOfPerson1+30)-dayOfPerson2;
				 monthOfPerson1--;
			}
			else
			{
				 x=dayOfPerson1-dayOfPerson2;
			}
			if(monthOfPerson1<monthOfPerson2)
			{
				 y=(monthOfPerson1+12)-monthOfPerson2;
				
				 yearOfPerson1--;
			}
			else
			{
				 y=monthOfPerson2-monthOfPerson1;
			}
			
			if(yearOfPerson2<=yearOfPerson1)
			{
				z=yearOfPerson1-yearOfPerson2;
			}
			else
			{
				z=yearOfPerson2-yearOfPerson1;
			}
			//System.out.println("Shyam is older than Ram by "+z+" years "+y+" months "+x+" days");
			message+= olderName+" is older than "+youngerName+" by "+z+" years "+y+" months "+x+" days";
		
			
		}
		
		else
		{
			olderName += object2.getName();
			youngerName += getName();
			if(dayOfPerson2<dayOfPerson1)
			{
				 x=(dayOfPerson2+30)-dayOfPerson1;
				 
				 monthOfPerson2--;
			}
			else
			{
				 x=dayOfPerson2-dayOfPerson1;
			}
			if(monthOfPerson2<monthOfPerson1)
			{
				 y=(monthOfPerson2+12)-monthOfPerson1;
								 yearOfPerson2--;
			}
			else
			{
				 y=monthOfPerson2-monthOfPerson1;
			}
			if(yearOfPerson1>=yearOfPerson2)
			{
				z=yearOfPerson1-yearOfPerson2;
			}
			else
			{
				z=yearOfPerson2-yearOfPerson1;
			}
		
			message+= olderName+" is older than "+youngerName+" by "+z+" years "+y+" months "+x+" days";
		}
		return message;
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + "]";
	}

}

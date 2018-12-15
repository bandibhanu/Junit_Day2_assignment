
public class RectangleClass {
private int length;
private int breadth;
	public RectangleClass(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		// TODO Auto-generated method stub	
	}
	public int rectangleOne()
	{
		int area1=length*breadth;
		return(area1);
	}
	public double perimeter() 
	{
		int perimeter=2*(length+breadth);
		return(perimeter);
		// TODO Auto-generated method stub
		
	}
	
	

}

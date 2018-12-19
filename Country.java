
public class Country 
{
private String countryName;
private int population;
private int Area;

public Country(String value1, int value2, int value3)
{
	this.countryName=value1;
	this.population=value2;
	this.Area=value3;
}

public String getCountryName() {
	return countryName;
}

public void setCountryName(String countryName) {
	this.countryName = countryName;
}

public int getPopulation() {
	return population;
}

public void setPopulation(int population) {
	this.population = population;
}

public int getArea() {
	return Area;
}

public void setArea(int area) {
	Area = area;
}

public int first(Country object1, Country object2, Country object3)
{
	int populationArray[]={object1.population,object2.population,object3.population};
	int temporary=0;
	int valueOne;
	int valueTwo=0;
	for( valueOne = 0;valueOne<=2;valueOne++)  
	    {  
	        for(valueTwo = valueOne+1; valueTwo<=2; valueTwo++)  
	        {  
	            if(populationArray[valueTwo] >populationArray[valueOne])  
	            {  
	                temporary = populationArray[valueOne];  
	                populationArray[valueOne] = populationArray[valueTwo];  
	                populationArray[valueTwo] = temporary;   
	            }   
	        }   
	    }
    
	return populationArray[0];
}

		public int area(Country object1, Country object2, Country object3){
		int temporary=0;
		int valueOne;
		
		int areaArray[]={object1.Area,object2.Area,object3.Area};
		for( valueOne = 0;valueOne<=2;valueOne++)  
	    {  
	        for(int valueTwo = valueOne+1; valueTwo<=2; valueTwo++)  
	        {  
	            if(areaArray[valueTwo]>areaArray[valueOne])  
	            {  
	                temporary = areaArray[valueOne];  
	                areaArray[valueOne] = areaArray[valueTwo];  
	                areaArray[valueTwo] = temporary;   
	            }   
	        }   
	    }
		
	return areaArray[0];
		}
	public double dencityPopulation(Country object1, Country object2, Country object3){
		double temporary=0;
		int valueOne;
		int dencityOfPopulation1=object1.population/object1.Area;
		int dencityOfPopulation2=object2.population/object2.Area;
		int dencityOfPopulation3=object3.population/object3.Area;
		
		
		double dencityOfPopulationArray[]={dencityOfPopulation1,dencityOfPopulation1,dencityOfPopulation1};
		for( valueOne = 0;valueOne<=2;valueOne++)  
	    {  
	        for(int valueTwo = valueOne+1; valueTwo<=2; valueTwo++)  
	        {  
	            if(dencityOfPopulationArray[valueTwo]>dencityOfPopulationArray[valueOne])  
	            {  
	                temporary = dencityOfPopulationArray[valueOne];  
	                dencityOfPopulationArray[valueOne] = dencityOfPopulationArray[valueTwo];  
	                dencityOfPopulationArray[valueTwo] = temporary;   
	            }   
	        }   
	    }    		
			return dencityOfPopulationArray[0];
	
}


}



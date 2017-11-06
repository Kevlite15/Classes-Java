package edu.albany.hw2.car;

public class FuelGauge {
	
	private double curFuel; //Cars fuel in gallons
	
	//Constructor
	public FuelGauge(double curFuel) 
	{
		this.curFuel = curFuel;
	}
	
	//Getter
	public double getCurFuel()
	{
		return curFuel;
	}
	
	//Fuel Incrementor Method
	public void incFuel()
	{
		//Checks if the fuel is not full
		if (curFuel != 15.0)
			//Increments fuel 
			curFuel += 1.0;
		else
		{
			//Notify's User that the Tank if Full
			System.out.println("Fuel Tank Is Full");
		}		
	}
	//Fuel Decrementor Method
	public void decFuel()
	{
		//Checks if the fuel is not Empty
		if (curFuel != 0.0)
			//Decrements fuel 
			curFuel -= 1.0;
		else
		{
			//Notify's User that the Tank if Empty
			System.out.println("Fuel Tank Is Empty");
		}	
	}
}

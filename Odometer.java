package edu.albany.hw2.car;

public class Odometer {
	
	//Variables and Constants
	private double curMileage;
	private double intMileage;
	private static int fuelPerMile = 22;

	//Constructor
	public Odometer(double curMileage) {
		this.curMileage = curMileage;
		
		intMileage = curMileage;
	}
	
	//Mileage Getter
	public double getCurMileage()
	{
		return curMileage;
	}
	
	//Mileage Increment
	public boolean incMilege()
	{
		//Checks if Mileage is at Max 
		if (curMileage != 999999)
			//If not Increments
			curMileage += 1.0;
		//If Mileage is at Max
		if (curMileage == 999999)
			//Reset Milege to 0
			curMileage = 0.0;	
		//Returns true every time one gallon of fuel is used 
		if ((curMileage % fuelPerMile) == (intMileage % fuelPerMile))
			return true;
		else
		{
			return false;
		}
	 }
}

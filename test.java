package edu.albany.hw2.car;

public class test {

	public static void main(String[] args) {
		
		//Initialing Objects
		FuelGauge FG = new FuelGauge(1);
		Odometer  OM = new Odometer(999910);
		
		//Fueling up the car using a for loop
		for (int i=0; i < 15; i++){
			System.out.println(FG.getCurFuel());
			FG.incFuel();
		}
		
		//"Drives the Car" until the Fuel is done. Using endless while loop.
		while(true)
		{
			System.out.println(OM.getCurMileage());
			System.out.println(FG.getCurFuel());
			if (true == OM.incMilege())
				FG.decFuel();		
			else if (0.0 == FG.getCurFuel())
				break;
		}	
	}
}

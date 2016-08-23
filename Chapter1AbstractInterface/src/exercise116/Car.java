package exercise116;

public class Car extends Transport implements IMoving,IUsingFuel{
	private String gear;
	private String model;
	@Override
	public double calUsingFuel() {
		double result=0;
		result=this.distance/this.usedFuel;
		return result;
	}
	@Override
	public double calSpeed() {
		double result=0;
		result=this.distance/this.time;
		return result;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	

	
	public Car(String color, String manufactory, String numberID, String owner,
			double distance, double time, double usedFuel) {
		super();
	}
	public Car(String color, String manufactory, String numberID, String owner,
			double distance, double time, double usedFuel, String gear,
			String model) {
		super();
		this.gear = gear;
		this.model = model;
	}
	@Override
	public String toString() {
		String s;
		s=super.toString()+"\nSpeed: "+this.calSpeed()+"\nUsing Fuel: "+calUsingFuel();
		return s;
	}
	
}

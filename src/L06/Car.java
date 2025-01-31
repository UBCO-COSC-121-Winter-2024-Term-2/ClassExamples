package L06;

public class Car implements Comparable<Car> {
	
	private int topSpeed;
	public String model;
	public int numberOfDoors;
	
	public Radio r;
	
	public Car(int topSpeed, String model, int numberOfDoors)
	{
		this.topSpeed = topSpeed;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
		r = new Radio();
	}

	public int getTopSpeed()
	{
		return this.topSpeed;
	}
	
	public void printTopSpeed()
	{
		System.out.println(this.model + " has a top speed of " + this.topSpeed + " with " + this.numberOfDoors + "doors");
	}
	
	public String toString() {
		return this.model + " has a top speed of " + this.topSpeed + " with " + this.numberOfDoors + " doors";
	}

	@Override
	public int compareTo(Car kar) {  //this is a klassy kar
		//If our car has a greater topspeed, return 1; 
//		if (this.topSpeed > kar.getTopSpeed()) return 1;
//		else if (this.topSpeed < kar.getTopSpeed()) return -1;
//		else return 0;
		if (this.numberOfDoors > kar.numberOfDoors) return 1;
		else if (this.numberOfDoors < kar.numberOfDoors) return -1;
		else return 0;
	}
	
	public void getChannel()
	{
		r.printChannel();
	}
	
	public void setChannel(double channel)
	{
		r.setChannel(channel);
	}
	
	public Object clone() throws CloneNotSupportedException{
		
		//for a deep copy
		//1 make copy of obj
		
//		Car c = (Car)super.clone();
//		Radio newRadio = (Radio)r.clone();
//		c.r = newRadio;
//		return c;
		return super.clone();
	}
	
}

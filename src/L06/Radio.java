package L06;

public class Radio implements Cloneable {
	
	private double channel;
	
	public Radio()
	{
		this.channel = 99.9;
	}
	
	public void printChannel()
	{
		System.out.println("Channel is " + this.channel);
	}
	
	public void setChannel(double channel) {
		this.channel = channel;
	}
	
	//Don't forget!!!! if you want to clone!
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}

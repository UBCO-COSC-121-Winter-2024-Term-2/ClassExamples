package L2;

public class Parent {

	private String name;
	
//	public Parent()
//	{
//		//this is the parent
//		System.out.println("This is the parent no-arg constructor");
//	}
	
	public Parent(String name)
	{
		//this is the parent]
		this.name = name;
		System.out.println("This is the parent no-arg constructor");
	}
	
	public void printClass()
	{
		
		System.out.println("This is the parent....");
	}
	
	public String toString() {
		return "I am your father....";
	}
	
	public void setName(String name)
	{		
		this.name = name;		
	}
}

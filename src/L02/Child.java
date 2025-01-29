package L02;

public class Child extends Parent{

	private String name;
	
	public Child()
	{
		//do something....
		//super();
		this("baby yoda");
		System.out.println("This is the child no-arg constructor");
		
	}
	
	public Child(String name)
	{
		//IT MUST CALL super();
		super(name);
		this.setName(name);
		System.out.println("This is the child one-arg constructor");
	}
	
//	public void setName(String name)
//	{		
//		this.name = name;		
//	}
	//overriding or overloading...
	public void printClass(String s)
	{
		System.out.println("This is the child.... with a string " + s);
	}
	
	public void printClass()
	{
		System.out.println("This is the child....");
		super.printClass();
	}
	
	//this is not your parents constructor....
	//wow this is confusing.....let's not do this
	public void parent() {
		System.out.println("this is not your parent....");
	}
	
	public String toString() {
		//return "I am Luke";
		//return super.toString();
		return "I am Luke.  NO!  " + super.toString();

	}
}

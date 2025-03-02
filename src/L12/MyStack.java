package L12;

import java.util.ArrayList;

public class MyStack {

	private ArrayList al = new ArrayList();   //just have it as an object 
	
	public MyStack() {
		// TODO Auto-generated constructor stub
	}

	public void push(Object o)
	{
		al.add(o);
	}
	
	public Object peek()
	{
		//we need to add some guards to check if the size is zero
		if (this.isEmpty())
			return null;
		else
			return al.get(al.size()-1);
	}
	
	public Object pop()
	{
		
		if (this.isEmpty())
			return null;
		else
		{
			Object o = al.get(al.size()-1);
			al.remove(al.size()-1);
			return o;
		}
	}
	
	public int size() {
		return al.size();
	}
	
	public boolean isEmpty() {
		if (this.size() == 0) return true;
		else return false;
	}
	
	
}

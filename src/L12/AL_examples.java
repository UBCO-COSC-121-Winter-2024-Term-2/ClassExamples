package L12;

import java.util.ArrayList;

public class AL_examples {

	public static void main(String[] args)
	{
		
		ArrayList<String> al = new ArrayList<>();
		
		System.out.println(al);
		
		al.add("A");
		al.add("B");
		al.add(null);
		al.add("C");
		
		System.out.println(al);

		al.add(0,"BeforeA");

		System.out.println(al);
		
		System.out.println("Size: " + al.size());
		
		//al.add(11,"AfterC");  //this won't work!  
		al.add(5,"AfterC");
		
		System.out.println(al);
		System.out.println("Size: " + al.size());
		
		//System.out.println(al[0]);  //this won't work because it's not an array!!!!!!
		
		al.set(0, "NewA");
		System.out.println(al);
		
		System.out.println(al.get(4));
		//System.out.println(al.get(11)); //will this work?
		
		al.remove(0);
		System.out.println(al);
		
		al.trimToSize();  //this will make a new array interally and copy stuff!! 

		
		

		
	}

}

package L13;

import java.util.ArrayList;
import java.util.Iterator;

public class Remove {

	public Remove() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("A");
		al.add("B");
		al.add("A");
		
		System.out.println(al);
		
		for (int i = 0; i < al.size(); i++)
		{
			al.remove("A");
			System.out.println("Size: " + al.size());
		}
		System.out.println(al);
		
		for (int i = 0; i < 10000; i++)
		{
			al.add("A");
			al.add("Z");
		}
		
		
		long start = System.currentTimeMillis();
		System.out.println("Starting #1");
		while(al.contains("A"))
			al.remove("A");
		System.out.println("Stopping #1");
		long stop = System.currentTimeMillis();
		System.out.println("time: " + (stop-start));
		Iterator<String> it = al.iterator();
		
		
		start = System.currentTimeMillis();
		System.out.println("Starting #2");
		while(it.hasNext())
		{
			if(it.next().equals("A"))
				it.remove();
		}
		System.out.println("Stopping #2");
		stop = System.currentTimeMillis();
		System.out.println("time: " + (stop-start));

		
	}

}

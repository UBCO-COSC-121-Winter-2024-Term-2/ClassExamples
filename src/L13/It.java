package L13;

import java.util.ArrayList;
import java.util.Iterator;


public class It {

	public It() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		
		for (int i = 0; i < 10; i++)
			al.add(i);
		
		System.out.println(al);
		
		Iterator<Integer> it = al.iterator();
		
		//it.remove();   //cant do this without first calling next
		
		System.out.println(it.next());		//next
		it.remove();
		System.out.println(al);

		Integer i;
		while(it.hasNext())
		{
			i = it.next();
			System.out.println(i);
			//System.out.println(al);

		}
		//hasNext
		//remove
		//it.remove();
		

	}

}

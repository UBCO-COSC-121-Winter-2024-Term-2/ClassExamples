package L13;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIt {

	public ListIt() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		
		al.add("cat");
		al.add("dog");
		al.add("llama");
		
		ListIterator<String> li = al.listIterator();   //this is where....(it's just before 0)
		
		System.out.println(al);
		
		li.add("fish");   //this inserts a fish BEFORE the listIterator
		
		System.out.println(al);
		
		//[fish, cat, dog, llama]
		//		^
		System.out.println(li.previous()); //this is "fish"
		//[ fish, cat, dog, llama]
		// ^		
		System.out.println(li.next());     // this is 
		//[fish, cat, dog, llama]
		//		^
		System.out.println(li.previous());
		//[ fish, cat, dog, llama]
		// ^

		li.remove();		//removes fish
		System.out.println(li.next());  // prints cat
		li.remove();		//removes cat
		//System.out.println(li.previous()); //???
		
		
	
		
		al.add("llama");
		al.add("dog");
		al.add("cat");
		
		System.out.println(al);
		//print out my array in reverse!!
		li = al.listIterator(al.size());
		
		while(li.hasPrevious())
			System.out.print(li.previous() + " ");

		
	}

}

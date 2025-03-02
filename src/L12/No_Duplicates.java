package L12;

import java.util.ArrayList;
import java.util.Scanner;

public class No_Duplicates {

	public No_Duplicates() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.println("Enter integers (0 to end");
		int val = 0;
		do
		{
			val = in.nextInt();
			
			//
			if (val != 0)
				if (!al.contains(val))
					al.add(val);
		}while (val != 0);
		
		System.out.println(al);
		
		for (int i = 0; i < al.size();i++)
			System.out.print(al.get(i) + " ");
		
		

	}

}

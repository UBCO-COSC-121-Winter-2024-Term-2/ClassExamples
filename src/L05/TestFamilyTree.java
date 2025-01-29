package L05;

public class TestFamilyTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent p = new Parent();
		Child c = new Child();

		//SmallerChild sc = new SmallerChild();
		SmallerChild sc = new SmallerSmallerChild();
		//sc.yellLoud();			//this is because it is NOT known to the object ref (rule #2

		SmallerSmallerChild ssc = new SmallerSmallerChild();
		ssc.yellLoud();			//this is because it is NOT known to the object ref (rule #2

		Scream sc2 = new SmallerSmallerChild();
		sc2.yellLoud();			//this is because it is NOT known to the object ref (rule #2

		if (sc2 instanceof Scream)
		{System.out.println("sc2: I'm screaming");	
		}
		if (ssc instanceof Scream)
		{System.out.println("ssc: I'm screaming");	
		}
		
		((Scream)sc).yellLoud();
	}

	
}

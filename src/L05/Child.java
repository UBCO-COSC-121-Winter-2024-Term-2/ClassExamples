package L05;


public class Child extends Parent {

	@Override
	public void doSomething() {
			System.out.println("This does something..");
		
	}

}

//we could implement implements Scream  here
abstract class SmallerChild extends Child {   //this makes things abstract again
	public abstract void doSomething();

}

class SmallerSmallerChild extends SmallerChild implements Scream {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	} 	// and concrete once more
	
	public void yellLoud() {
		System.out.println("ARGHGHGHGHGH!!!");
	}
	
}

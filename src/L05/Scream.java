package L05;

public interface Scream {
	
	public abstract void yellLoud();
	
	default void complain() {
		System.out.println("I'm complaining");
	}

}

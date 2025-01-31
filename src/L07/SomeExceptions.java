package L07;

public class SomeExceptions {
	
	public static void doSomething() throws Exception{
		
		//watch out for this!!!!
		
		int arr[] = new int[3];
		try {
			System.out.println("Starting...");
			System.out.println(arr[1]);   //exception?
			System.out.println("Ending...");
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("This is the finally!");
		}
		
		System.out.println("this is after the finally...");
		
	}

	public static void doDivision() throws ArithmeticException {
		
		int x  = 1000 / 1;
		
		System.out.println(x);				///here A?
		
		x = 1000 / 10;
		
		System.out.println(x);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			doDivision();
//			System.out.println("After bad division");  //here C?
//		}
//		catch (ArithmeticException e)
//		{
//			System.out.println("I'm handling the ArithmeticException exception!");
//			System.out.println(e);
//			
//		}
//		catch (Exception e)  //this will catch ALL Exceptions!
//		{
//			System.out.println("I'm handling the Exception (Parent) exception!");
//			System.out.println(e);
//			
//		}
//		finally {
//			System.out.println("I will ALWAYS run!");
//		}
//		System.out.println("The next statement AFTER the catch");
//		//here B???
		
		try {
			doSomething();
			System.out.println("this is after something");
		}
		catch(Exception e)
		{
			System.out.println("This is the general exception!!");
		}
	}
	
	

}

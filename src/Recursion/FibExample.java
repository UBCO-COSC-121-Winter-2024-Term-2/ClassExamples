package Recursion;

public class FibExample {

	static int numCalls=0;
	static int depth = 0;
	public static int fib(int n) {
		
		numCalls ++;
		depth ++;
		//base cases?
		//0
		
		
		if (n == 0) {depth = 0; return 0;}
		else if (n == 1) return 1;
		else 
		{	System.out.println(depth);
			return fib(n-1) + fib(n-2);			//here is the sub problems
		}
	}
	
	public static void p(int num) {
		numCalls = 0;
		System.out.println("Fib of " + num + " is " + fib(num));   //the first call
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tests
		
//		p(2);			//should print out 
//		System.out.println("The number of calls has been " + numCalls);
//		
//		p(3);			//should print out 
//		System.out.println("The number of calls has been " + numCalls);
		
		p(10);
		System.out.println("The number of calls has been " + numCalls);
		
//		p(20);
//		System.out.println("The number of calls has been " + numCalls);
//		
		p(30);
		System.out.println("The number of calls has been " + numCalls);
//		
//		p(40);
//		System.out.println("The number of calls has been " + numCalls);
//		
//		p(50);
//		System.out.println("The number of calls has been " + numCalls);
	}

}

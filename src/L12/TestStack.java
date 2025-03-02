package L12;

public class TestStack {

	public TestStack() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		MyStack ms = new MyStack();
		
		System.out.println("Size: " + ms.size());
		
		ms.push("one");
		ms.push("two");
		ms.push("three");
		
		System.out.println("Size: " + ms.size());
		
		//let's peek at the top
		System.out.println(ms.peek());
		
		System.out.println("Pop " + ms.pop());		//this will remove top
		System.out.println("Size: " + ms.size());
		
		//let's peek at the top
		System.out.println(ms.peek());
		
		System.out.println("Pop " + ms.pop());		//this will remove top
		System.out.println("Size: " + ms.size());
		
		
		//let's peek at the top
		System.out.println(ms.peek());
		
		System.out.println("Pop " + ms.pop());		//this will remove top
		System.out.println("Size: " + ms.size());
		
		
		//the stack is empty.....
		System.out.println("Pop " + ms.pop());	
		
		String str = "Hello";
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			ms.push(str.charAt(i));
		}
		
		System.out.println();
		
		while(!ms.isEmpty())
		{
			System.out.print(ms.pop());
		}
		
		
	
}

}

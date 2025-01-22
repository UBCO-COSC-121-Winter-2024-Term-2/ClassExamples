package L03;

public class Main {
	public static void main(String[] args) {
		Human h = new Student();
		print(h);
	}
	static void print(Object x) {
		System.out.print("1) object");
	}
	static void print(Human x) {
		System.out.print("2) ");
		x.foo();
	}
	static void print(Student x) {
		System.out.print("3) ");
		x.foo();
	}
}

class Human{
	void foo() {System.out.println("human");}
}
class Student extends Human{
	void foo() {System.out.println("student");}
}


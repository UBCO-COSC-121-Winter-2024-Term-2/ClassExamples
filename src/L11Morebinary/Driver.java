package L11Morebinary;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Book b = new Book("Basic Programming", 10000);
		System.out.println(b);
		System.out.println(b.p);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"));
	
		oos.writeObject(b);
		oos.close();
		
		b = null;
		System.out.println(b);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.dat"));
		

		Book b2 = (Book)ois.readObject();
		System.out.println(b2);
		System.out.println(b2.p);
		ois.close();

		
	}

}

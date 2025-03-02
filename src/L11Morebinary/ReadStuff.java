package L11Morebinary;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadStuff {

	public ReadStuff() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("stuff.dat"));
		//one integer value
		dos.writeInt(4);
		dos.writeInt(15);
		dos.writeShort(12);
		
		dos.close();
		
		
		//open the file again
		DataInputStream dis = new DataInputStream(new FileInputStream("stuff.dat"));
		System.out.println(dis.readInt());
		System.out.println(dis.readInt());
		System.out.println(dis.readShort());


//		System.out.println(dis.readShort());
//		System.out.println(dis.readInt());
//		System.out.println(dis.readShort());
//		System.out.println(dis.readShort());
		
		dis.close();
		
		dos = new DataOutputStream(new FileOutputStream("stuff2.dat"));
		dos.writeChar('H');		//two bytes
		dos.writeChar('i');		//two bytes
		dos.writeUTF("Hi");		//how many bytes....?
		dos.close();
		
		dis = new DataInputStream(new FileInputStream("stuff2.dat"));
		System.out.println(dis.readChar());
		System.out.println(dis.readChar());
		System.out.println(dis.readUTF());
	}
}

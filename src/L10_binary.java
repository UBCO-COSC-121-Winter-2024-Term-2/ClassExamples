import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class L10_binary {

	public L10_binary() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream out = new FileOutputStream("temp.dat");
		
		for (int i = 0; i <= 255; i++)
			out.write(i);

		out.close();
		
		FileInputStream in = new FileInputStream("bob.txt");
		int value = in.read();
		while(value != -1)
		{
			System.out.print((char)value + " ");
			value = in.read();
		}
		in.close();
		
		
	}

}

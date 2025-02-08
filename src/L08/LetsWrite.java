package L08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LetsWrite {

	public LetsWrite() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File file = new File("out.txt");
//		try {
//			PrintWriter pw = new PrintWriter(file);
////			pw.println("This is my message");
////			pw.println("This is the second line");
//			pw.println("This is a new message");
//			pw.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//try-with 
		File file = new File("out.txt");
		try (PrintWriter pw = new PrintWriter(file);){
//			pw.println("This is my message");
//			pw.println("This is the second line");
			pw.println("This is a another new message");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

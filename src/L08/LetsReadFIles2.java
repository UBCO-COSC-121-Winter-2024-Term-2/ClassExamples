package L08;

import java.io.File;
import java.io.*;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LetsReadFIles2 {

	public LetsReadFIles2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		File file = new File("bob.txt");
		int lineCnt = 0;

		try {
			Scanner in = new Scanner(file);
			while (in.hasNext())  // this will check to make sure there is a nextline of TEXT
			{
				try {
					String word1 = in.next();
					String word2 = in.next();
					System.out.println(word1);
					System.out.println(word2);
				}catch(NoSuchElementException e) {
					System.err.println("Missing item!!!");
				}
			}
			
			in.close();
		}
		catch(FileNotFoundException e)  //or just use Exception
		{
			System.out.println("The file you are looking for is not here...");
			System.out.println(e);
		}
		finally {
			System.out.println("Lines read: " + lineCnt);
		}
			
	}	
}

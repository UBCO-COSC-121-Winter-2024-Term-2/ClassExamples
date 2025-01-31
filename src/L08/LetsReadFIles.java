package L08;

import java.io.File;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LetsReadFIles {

	public LetsReadFIles() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		File file = new File("bob.txt");
		int lineCnt = 0;

		try {
			Scanner in = new Scanner(file);
			while (in.hasNext())  // this will check to make sure there is a nextline of TEXT
			{
				String line = in.nextLine();
				System.out.println(line);
				lineCnt++;
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
		
		
		try {
			Scanner in = new Scanner(file);
			while (in.hasNext())  // this will check to make sure there is a nextline of TEXT
			{
				String word = in.next();
				System.out.println(word);
				lineCnt++;
			}
			
			in.close();
		}
		catch(FileNotFoundException e)  //or just use Exception
		{
			System.out.println("The file you are looking for is not here...");
			System.out.println(e);
		}
		finally {
			System.out.println("Tokens read: " + lineCnt);
		}
		
		try {
			Scanner in = new Scanner(file);
			while (in.hasNext())  // this will check to make sure there is a nextline of TEXT
			{
				int num = 0;
				try {
				num = in.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("Tried to read a number, but the next item isn't a number");
					in.next();
				}
				System.out.println(num);
				lineCnt++;
			}
			
			in.close();
		}
		catch(FileNotFoundException e)  //or just use Exception
		{
			System.out.println("The file you are looking for is not here...");
			System.out.println(e);
		}
		finally {
			System.out.println("Tokens read: " + lineCnt);
		}
	}

}

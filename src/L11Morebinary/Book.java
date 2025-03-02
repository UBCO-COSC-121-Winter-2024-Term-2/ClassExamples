package L11Morebinary;

import java.io.Serializable;

public class Book implements Serializable{

	String title;
	int numberOfPages;
	 Page p;			// added an object...
	
	public Book(String title, int numPages) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.numberOfPages = numPages;
		this.p = new Page(1);
	}
	
	public String toString()
	{
		return this.title + " num pages: " +this.numberOfPages;
	}

}

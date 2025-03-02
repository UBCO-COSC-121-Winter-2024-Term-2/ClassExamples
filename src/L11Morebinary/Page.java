package L11Morebinary;

import java.io.Serializable;

public class Page implements Serializable{

	int pageNumber;

	public Page(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	public String toString()
	{
		return "page number: " + this.pageNumber;
	}

}

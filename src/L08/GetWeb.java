package L08;

import java.net.URL;
import java.util.*;

public class GetWeb {

	public GetWeb() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		URL url = new URL("http://www.example.com");
		Scanner in = new Scanner(url.openStream());
		while (in.hasNext())
			System.out.println(in.nextLine());
		in.close();

	}

}

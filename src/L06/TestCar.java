package L06;

import java.util.Arrays;

public class TestCar {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Car gti = new Car(250, "GTI", 3);
		Car mercedes = new Car(300,"Mercedes", 2);
		Car smartCar = new Car(90, "Smart",2);
		Car morgan = new Car(50, "Morgan", 1);
		
		if (gti.compareTo(smartCar) > 0 ) System.out.println("The gti is faster");
		
		if (smartCar.compareTo(mercedes) > 0 ) System.out.println("The smartCar is faster");
		
		if (mercedes.compareTo(gti) > 0 ) System.out.println("The mercedes is faster");
		
		Car[] myCars = new Car[4];
		
		myCars[0] = gti;
		myCars[1] = mercedes;
		myCars[2] = smartCar;
		myCars[3] = morgan;
 		
		System.out.println(Arrays.toString(myCars));
		
		Arrays.sort(myCars);  //this has changed the order of the itmes in the array based on their compareTo method
		
		//this 
		System.out.println(Arrays.toString(myCars));
		
		gti.setChannel(104.7);
		
		//Car newGti = (Car)(gti.clone());
		
//		System.out.println(newGti);
//		System.out.println(newGti == gti);
//		
//		System.out.println("NewGTI");
//		newGti.getChannel();
		
		//set channel on GTI
		gti.setChannel(88.9);
		
		System.out.println("NewGTI");
		//newGti.getChannel();
		try {
		gti.clone();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}

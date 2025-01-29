package L04;

public class Staff {
	
	public static void whatObject(Object o)
	{
		//figure out the specific type of object o actually is..
		if (o instanceof Hourly)
		{//I want to print out the method printHourly
			((Hourly)o).printHourly();
		}
		else
		{
			System.out.println("Not hourly");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Volunteer v = new Volunteer();
		Executive e1 = new Executive();
		Executive e2 = new Executive();
		Hourly h1 = new Hourly();
		Hourly h2 = new Hourly();
		Hourly h3 = new Hourly();

//		StaffMember v = new Volunteer();
//		StaffMember e1 = new Executive();
//		StaffMember e2 = new Executive();
//		StaffMember h1 = new Hourly();
//		StaffMember h2 = new Hourly();
//		StaffMember h3 = new Hourly();
		
		StaffMember[] staff = new StaffMember[6];
		
		staff[0] = v;
		staff[1] = e1;
		staff[2] = e2;
		staff[3] = h1;
		staff[4] = h2;
		staff[5] = h3;
		
//		for(int idx = 0; idx < staff.length; idx++)
//		{
//			System.out.println(staff[idx]);
//		}
		
		for (StaffMember sm : staff )
		{
			System.out.println(sm);
		}
		
		whatObject(e1);
		
		whatObject(1);
		
		
	}

	
}

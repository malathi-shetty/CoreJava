package var;

public class StaticVar_2 {
	
	// objects share same variables
	
	
	String name; 
	String address; 
	
	static String city ; 
	static int i ;
	//int i =0;
	
	static {
		city = "Bangalore";
		i = 0;
		
	}
	
	
	
	StaticVar_2(String name, String address)  
	{
		this.name = name; 
		this.address=address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress()
	{
		System.out.println(address + " , " + city);
	}
	
	public void getName()
	{
		System.out.println(name);
	}
	
	public static void getCity()
	{
		System.out.println(city);
	}
	

	public static void main(String[] args) {
		
		StaticVar_2 newobj = new StaticVar_2("Bhushan", "Marthalli");
		StaticVar_2 newobj1 = new StaticVar_2("Arjun", "Jayanagar");
		
		newobj.getAddress();
		newobj1.getAddress();
		
		StaticVar_2.getCity();
		StaticVar_2.i=4;
		
		newobj.address="XYZ";

	}

}

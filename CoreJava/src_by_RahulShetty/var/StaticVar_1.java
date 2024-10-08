package var;

public class StaticVar_1 {

	String name; // instance variable
	String address; //instance variable which are not declared as static or in constructor
	
	static String city = "Bangalore"; // static variables are called class variables
	// variable copy is shared across all the object because of static, saving memory
	// static is part of class StaticVar_1 & not object
	
	
	
	StaticVar_1(String name, String address) // variables that comes under constructor are local variable 
	{
		this.name = name; // current variable
		this.address=address;
		
	}
	
	public void getAddress()
	{
		System.out.println(address + " , " + city);
	}
	
	public void getName()
	{
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		
		StaticVar_1 newobj = new StaticVar_1("Bhushan", "Marthalli");
		StaticVar_1 newobj1 = new StaticVar_1("Arjun", "Jayanagar");
		
		newobj.getAddress();
		newobj1.getAddress();
		
	}

}

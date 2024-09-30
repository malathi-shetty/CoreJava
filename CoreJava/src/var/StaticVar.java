package var;

public class StaticVar { // class declaration
	
	String name; // instance variable
	String address;
	String city;
	
	StaticVar(String name, String address, String city) // local variable - constructor
	{
		this.name = name; // current variable
		this.address=address;
		this.city = city;
	}
	
	public void getAddress()
	{
		System.out.println(address);
	}
	
	public void getName()
	{
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		
		StaticVar newobj = new StaticVar("Bhushan", "Marthalli", "Bangalore");
		StaticVar newobj1 = new StaticVar("Arjun", "Jayanagar", "Bangalore");
		
		newobj.getAddress();
		newobj1.getAddress();
		

	}

}

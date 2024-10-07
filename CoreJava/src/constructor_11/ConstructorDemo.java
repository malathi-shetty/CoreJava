package constructor_11;

public class ConstructorDemo {

	public ConstructorDemo() // Constructor should not return any values
	{
		System.out.println("I am the Constructor");
		System.out.println("Define variables");
		System.out.println("Initiate properties in real time framework ");
		System.out.println("******");
	}
	
	public void getdata()
	{
		System.out.println("I am the method"); // expecting some return value so written void
	}
	
	public static void main(String[] args) {
		// Constructor executes a block of code when ever an object is created
		// means whenever an object is created, block of code is executed i.e
		// Constructor is invoked whenever u create an object
		
		//Constructor will not return any values
		//Name of Constructor should always be className
		
		ConstructorDemo cd = new ConstructorDemo();
		cd.getdata();
		
		//whenever u create / instantiate an object, constructor is called
		
		// Compiler will call Default/implicit constructor if u have not defined/explicit any Constructor block

	}

}

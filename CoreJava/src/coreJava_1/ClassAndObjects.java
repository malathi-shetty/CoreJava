package coreJava_1;

public class ClassAndObjects { // className
	
	
	int a=5; // Variable
	
	public void getData() // Method
	{
		System.out.println("I am a Method");
	}
	
	

	public static void main(String[] args) {
		
		ClassAndObjects co = new ClassAndObjects();
		// Objects are instances/references of a class
		// new ClassAndObjects(); -- Memory allocated for the object should always be className with New operator
		// co -- define the object name
		// ClassAndObjects co -- return type for the object name should always be className
		
		// to execute the method outside the main method can be called by class object
		co.getData();
		System.out.println("Variable: " + co.a);
		
		SecondClass sn = new SecondClass(); // By creating an object of second class & calling it in the first class
		sn.setData();
		

	}

}

package Local_static_instance;

public class Local_static_instance_VARIABLE {
	
	
	void m1(){ 
		int b =10; // local variable
		System.out.println("Local variable b inside m1(): " + b);
	}
	
	int m2() {
		int a = 20;
		return a;
	}


	int k =30; // instance variable: outside the method, inside the class
	
	static int s=40; // static variable
	
	public static void main(String[] args) {
		
		//Local:  inside the main method, inside the method, inside the constructor
		//memory assigned to the local variables: when we create a method, memory is allocated

		int i = 50;
		System.out.println("Local Variable: " + i);
		

		// how to access instance : by creating an object, we get access to instance 
		// how to create object a class: by taking classname c = new classname(); here c is an object
		Local_static_instance_VARIABLE lsi = new Local_static_instance_VARIABLE();
		System.out.println("Instance Variable: " + lsi.k); // instance variable
		
		//how to access static : direct, classname, object
		// why direct because main method has static on it "public static void main(String[] args)"
		// static is mostly used by using classname
		
		System.out.println("Direct Static Variable: " + s);
		System.out.println("Object Static Variable: " + lsi.s);
		System.out.println("ClassName Static Variable: " + Local_static_instance_VARIABLE.s);
		
		
		lsi.m1(); // This will print b
		
		int aValue = lsi.m2();
		System.out.println("Value of a returned from m2(): " + aValue);


	}

}

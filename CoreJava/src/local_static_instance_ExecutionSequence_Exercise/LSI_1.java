package local_static_instance_ExecutionSequence_Exercise;

public class LSI_1 {
	
	static {
		System.out.println("static blocks");
	}
	
	{
		System.out.println("instance blocks");
	}
	
	static void m1(){
		System.out.println("static method");
	}
	
	void m2(){
		System.out.println("instance method");
	}
	
	LSI_1(){
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


// output: static blocks

/*Note:  

Static block: runs once when class is loaded

Instance block: runs every time an object is created, before constructor

Constructor: runs after instance block

*/
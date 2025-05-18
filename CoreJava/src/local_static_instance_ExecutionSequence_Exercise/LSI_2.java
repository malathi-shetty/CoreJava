package local_static_instance_ExecutionSequence_Exercise;

public class LSI_2 {
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
	
	LSI_2(){
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		LSI_2 newobj = new LSI_2();

	}

}

/*output:
 * 
 *
static blocks

instance blocks

Constructor

*/
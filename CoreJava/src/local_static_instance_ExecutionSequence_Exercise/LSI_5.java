package local_static_instance_ExecutionSequence_Exercise;

public class LSI_5 {
	// static block CANNOT BE inside instance block
	// This part is illegal and causes compilation failure:
	// You cannot declare a static block inside an instance block — this causes the
	// compiler to throw an error: illegal start of expression

	static {
		System.out.println("static blocks");
	}

	{
		System.out.println("instance blocks");
		
		static {
			System.out.println("static blocks");
		}
	}

	static void m1() {
		System.out.println("static method");
	}

	void m2() {
		System.out.println("instance method");
	}

	LSI_5(){
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		LSI_5 newobj = new LSI_5();

	}

}

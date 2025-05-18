package local_static_instance_ExecutionSequence_Exercise;

public class LSI_3 {

	// instance blocks can be inside static block - ✅ Legal in syntax (because Java
	// allows instance blocks inside static blocks in this particular context), but
	// it's misleading because this doesn't create an actual instance initializer —
	// it behaves like a regular code block.

	static {
		System.out.println("static blocks");

		{
			System.out.println("instance blocks");
		}
	}

	{
		System.out.println("instance blocks");

	}

	static void m1() {
		System.out.println("static method");
	}

	void m2() {
		System.out.println("instance method");
	}

	LSI_3() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		LSI_3 newobj = new LSI_3();

	}
}

/*
 * output: static blocks instance blocks instance blocks Constructor
 *
 * 
 * Explanation of Output static blocks → Comes from the static block.
 * 
 * instance blocks → Inside the static block (but not a real instance block —
 * it's just a nested block that executes when the class is loaded).
 * 
 * instance blocks → From the actual instance initializer block.
 * 
 * Constructor → From the constructor after the instance block runs.
 * 
 * 
 * Code Block Type Executes When How Many Times
 * 
 * Static block Class is loaded Once
 * 
 * Nested {} in static block During static block execution Once (with static
 * block)
 * 
 * Instance block Object is created Every time
 * 
 * Constructor Object is created (after instance block) Every time
 * 
 * Key Concepts to Understand
 * 
 * Static block: Runs once when the class is loaded.
 * 
 * Instance block: Runs every time an object is created, before the constructor.
 * 
 * Code block inside static block ({}): This is just a normal block, not a real
 * instance initializer. It runs as part of the static block's execution.
 * 
 * Constructor: Runs every time an object is created, after the instance block.
 * 
 */
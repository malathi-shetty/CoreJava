package Local_static_instance.ExecutionSequence;

public class Test_ConstructorOverloading_this {
	
	//Java lets you create multiple constructors with different parameters:
// Use this() to call another constructor in the same class. Must be the first line.

	
	Test_ConstructorOverloading_this() {
	        System.out.println("Zero-parameter constructor");
	    }

	Test_ConstructorOverloading_this(String name) {
	        this(); // Calls the zero-parameter constructor
	        System.out.println("Parameterized constructor for: " + name);
	    }

}

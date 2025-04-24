package Local_static_instance.ExecutionSequence;

public class Test_ConstructorOverloading_super {
	//Using super() to Call Parent Constructor
	//super() calls the parent class constructor. Must be on the first line of the child constructor.
	
	class A {
	    A() {
	        System.out.println("Parent constructor");
	    }
	}

	class B extends A {
	    B() {
	        super(); // Must be first line
	        System.out.println("Child constructor");
	    }
	}

}

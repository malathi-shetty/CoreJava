package Local_static_instance.ExecutionSequence;

public class StaticMethodOverriding_hidden {
	//⚠️ Static methods can't be truly overridden — they are hidden (shadowed). It's decided by reference type, not object.
	
	class A {
	    static void show() {
	        System.out.println("Static method in A");
	    }
	}

	class B extends A {
	    static void show() {
	        System.out.println("Static method in B");
	    }
	}

	public class Test {
	    public static void main(String[] args) {
	     //   A obj = new B(); //⚠️ Static methods can't be truly overridden — they are hidden (shadowed). It's decided by reference type, not object.
	  //      obj.show(); // Output: Static method in A
	    }
	}

}

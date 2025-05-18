package flowDemo;

public class Parent {
	
	 // Static block
    static {
        System.out.println("Parent static block");
    }

    // Instance block
    {
        System.out.println("Parent instance block");
    }

    // Constructor
    Parent() {
        System.out.println("Parent no-arg constructor");
    }

    Parent(String name) {
        System.out.println("Parent overloaded constructor: " + name);
    }

    // Static method (overloadable, not truly overridable)
    static void staticMethod() {
        System.out.println("Parent static method");
    }

    static void staticMethod(String msg) {
        System.out.println("Parent static method overloaded: " + msg);
    }

    // Instance method (can be overridden)
    void greet() {
        System.out.println("Parent greet()");
    }

    void greet(String name) {
        System.out.println("Parent greet(String): " + name);
    }

}

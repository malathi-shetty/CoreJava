package flowDemo;

public class Child extends Parent{
	 // Static block
    static {
        System.out.println("Child static block");
    }

    // Instance block
    {
        System.out.println("Child instance block");
    }

    // Constructor
    Child() {
        super("from Child constructor");
        System.out.println("Child no-arg constructor");
    }

    // Instance method override
    @Override
    void greet() {
        System.out.println("Child overridden greet()");
    }

    // Overloaded greet method
    void greet(int age) {
        System.out.println("Child greet(int): " + age);
    }

    // Hides static method
    static void staticMethod() {
        System.out.println("Child static method (hiding)");
    }
    
    
}


package demo;


class Parent {

    // Static
    static void staticMethod() {
        System.out.println("Parent static");
    }

    // Instance
    void instanceMethod() {
        System.out.println("Parent instance");
    }

    // Constructor
    Parent() {
        System.out.println("Parent constructor");
    }

    Parent(String msg) {
        System.out.println("Parent overloaded constructor: " + msg);
    }
}

class Child extends Parent {

    static void staticMethod() {
        System.out.println("Child static (hiding)");
    }

    @Override
    void instanceMethod() {
        System.out.println("Child instance (overridden)");
    }

    Child() {
        super("called from child");
        System.out.println("Child constructor");
    }

    Child(int x) {
        this(); // call no-arg constructor
        System.out.println("Child overloaded constructor: " + x);
    }
}
public class Demo {

	public static void main(String[] args) {
		System.out.println("== Static method call ==");
        Parent.staticMethod(); // Parent static
        Child.staticMethod();  // Child static

        System.out.println("\n== Instance method call with polymorphism ==");
        Parent p = new Child(5);
        p.instanceMethod(); // Child's overridden version

        System.out.println("\n== Constructor overloading demo ==");
        new Child();
    }

}

/*

== Static method call ==

Parent static

Child static (hiding)

== Instance method call with polymorphism ==

Parent overloaded constructor: called from child

Child constructor

Child overloaded constructor: 5

Child instance (overridden)

== Constructor overloading demo ==

Parent overloaded constructor: called from child

Child constructor

*/


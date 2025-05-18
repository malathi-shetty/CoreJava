package flowDemo;

public class BlockFlowDemo {

	public static void main(String[] args) {
		System.out.println("Main method starts");

        // Call static methods
        Parent.staticMethod();
        Parent.staticMethod("hello");
        Child.staticMethod(); // method hiding

        System.out.println("---- Creating Child object ----");
        Parent obj = new Child(); // polymorphism

        // Call instance methods
        obj.greet(); // overridden
        obj.greet("John"); // from Parent

        // Downcast to access Child-specific methods
        if (obj instanceof Child) {
            ((Child) obj).greet(25); // overloaded in Child
        }

        System.out.println("Main method ends");
    }

}

/*
 * Main method starts
Parent static block                  ← Triggered by Parent.staticMethod()
Parent static method
Parent static method overloaded: hello
Child static block                   ← Triggered by Child.staticMethod()
Child static method (hiding)
---- Creating Child object ----
Parent instance block                ← Instance block from Parent
Parent overloaded constructor: from Child constructor
Child instance block                 ← Instance block from Child
Child no-arg constructor
Child overridden greet()             ← From overridden method in Child
Parent greet(String): John           ← From Parent method
Child greet(int): 25                 ← From overloaded method in Child
Main method ends

*/

/*
Class Loading:

Parent class will load when you first access any static method or create an object of Parent.

Child class will load when you first access any static method or create an object of Child.


Execution Flow:

When the BlockFlowDemo.main() method is executed, the JVM first loads the BlockFlowDemo class.

The static methods (like Parent.staticMethod()) then cause Parent and Child to load if they haven't been loaded yet.

Once the class is loaded, static blocks execute.



Static blocks only run when the class is loaded for the first time.

Class loading occurs the first time you reference a static member (method or field) of that class, or when you instantiate an object of the class.

If you access a method or create an object of Parent, the Parent class gets loaded, triggering its static block.

When you access the Child class, the JVM loads Child, triggering its static block.



🔸 JVM Class Loading Order (for separate .java files)

JVM loads only BlockFlowDemo at the start.

No static block of Parent or Child runs until one of them is first accessed in main().

🔸 When You Call Parent.staticMethod()

JVM loads Parent, so:

Parent static block runs

Method runs

🔸 When You Call Child.staticMethod()

JVM loads Child, so:

Child static block runs

Method runs



✅ Summary

Feature ->	Demonstrated?	-> Notes

Static block	-> 	✅		-> Runs once per class on load

Instance block	-> 	✅		-> Runs before constructor per object

Constructor overload	-> 	✅		-> Shown in Parent and used in Child

Static method overload	-> 	✅		-> staticMethod() and staticMethod(String)

Instance method override		-> ✅		-> greet() overridden in Child

Instance method overload		-> ✅	-> 	greet(String) in Parent, greet(int) in Child

--------


Execution Diagram (Step by Step)

MAIN METHOD STARTS

CLASS LOADING PHASE

-------------------------

✓ Parent static block         → Class Parent is loaded

✓ Child static block          → Class Child is loaded


-------------------------

✓ staticMethod()              → Parent version

✓ staticMethod("hello")       → Overloaded Parent static method

✓ Child.staticMethod()        → Hides Parent version

OBJECT CREATION (new Child)

-------------------------

✓ Parent instance block       → runs first

✓ Parent(String) constructor  → from super() in Child

✓ Child instance block

✓ Child constructor

METHOD CALLS
-------------------------
✓ greet()                     → Overridden in Child

✓ greet("John")               → Overloaded in Parent

✓ greet(25)                   → Overloaded in Child (via downcast)

MAIN METHOD ENDS


*/

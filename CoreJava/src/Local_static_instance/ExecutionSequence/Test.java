package Local_static_instance.ExecutionSequence;

class A {
    static {
        System.out.println("A: Static block"); // --> 1
    }
    {
        System.out.println("A: Instance block"); // --> 3
    }

    A() {
        System.out.println("A: Constructor"); // --> 5
    }
}

class B extends A {
    static {
        System.out.println("B: Static block"); // --> 2
    }
    {
        System.out.println("B: Instance block"); // --> 4
    }

    B() {
        System.out.println("B: Constructor"); // --> 6
    }
}

public class Test {
    public static void main(String[] args) {
        B obj = new B(); // Execution starts here
    }
}

/*
 * 
A: Static block     // 1

B: Static block     // 2

A: Instance block   // 3

A: Constructor       // 5

B: Instance block   // 4

B: Constructor       // 6
 * 
 */

/*
 * 
 * Understanding Static and Instance Blocks
 * 
 * Static blocks are executed once, when the class is first loaded into the JVM.
 * This happens only once, no matter how many objects of the class are created
 * later.
 * 
 * Instance blocks are executed every time an object of the class is
 * instantiated (i.e., every time the constructor is called).
 * 
 * Constructors are executed after the instance blocks. They are used to
 * initialize the object.
 * 
 * Class Loading and Object Creation Flow
 * 
 * Here’s what happens in the code when you run B obj = new B();:
 * 
 * Class A and B Static Blocks:
 * 
 * When the JVM begins execution, it first needs to load the classes used in the
 * program.
 * 
 * Static blocks are executed as the class is loaded, and they happen in the
 * order of inheritance: Parent class A is loaded first, followed by child class
 * B.
 * 
 * The static block in class A is executed first, printing A: Static block.
 * 
 * Then the static block in class B is executed, printing B: Static block.
 * 
 * At this point, the output so far is:
 * 
 * A: Static block
 * 
 * B: Static block
 * 
 * Instance Initialization for B:
 * 
 * Next, we create an object of class B by calling new B().
 * 
 * The JVM first calls the parent class constructor before executing the child
 * class constructor. So, it starts by running the instance initialization for
 * class A.
 * 
 * The instance block in class A is executed, printing A: Instance block.
 * 
 * After that, the constructor of A is called, printing A: Constructor.
 * 
 * At this point, the output is:
 * 
 * A: Static block
 * 
 * B: Static block
 * 
 * A: Instance block
 * 
 * A: Constructor
 * 
 * Instance Initialization for B:
 * 
 * After finishing the constructor for A, the JVM now executes the instance
 * initialization for class B (since the object is of type B).
 * 
 * The instance block in class B is executed, printing B: Instance block.
 * 
 * Finally, the constructor of class B is called, printing B: Constructor.
 * 
 * The final output is:
 * 
 * A: Static block
 * 
 * B: Static block
 * 
 * A: Instance block
 * 
 * A: Constructor
 * 
 * B: Instance block
 * 
 * B: Constructor
 * 
 * Key Points
 * 
 * Static blocks run when the class is first loaded, not when an object is
 * created.
 * 
 * Instance blocks run every time an object is created, but they are executed
 * before the constructor.
 * 
 * The parent class constructor is called first, followed by the child class
 * constructor.
 * 
 * So the flow is:
 * 
 * Load A -> Execute A's static block.
 * 
 * Load B -> Execute B's static block.
 * 
 * Create object B -> Execute A's instance block -> Execute A's constructor.
 * 
 * Continue object creation -> Execute B's instance block -> Execute B's
 * constructor.
 * 
 * **********
 * 
 * Execution Breakdown with Numbers:
 * 
Static Block Execution:

Class A static block: When the program starts, the JVM loads the class A. As part of this, it executes the static block in A. 
This happens before any object creation.

Output: A: Static block (Execution 1)

Class B static block: After A's static block, the JVM then loads class B. The static block in B is executed next.

Output: B: Static block (Execution 2)

Instance Block Execution:

Object creation of B: When new B() is called, it first constructs the parent class A (because B is a subclass of A).

Class A instance block: Before the constructor of A runs, the instance block of A is executed.

Output: A: Instance block (Execution 3)

Class A constructor: After the instance block of A, the constructor of A is called.

Output: A: Constructor (Execution 5)

Instance Block and Constructor for B:

Class B instance block: Now that A's constructor is finished, the instance block of B runs.

Output: B: Instance block (Execution 4)

Class B constructor: Finally, the constructor of B runs.

Output: B: Constructor (Execution 6)

Final Output:

A: Static block     // 1

B: Static block     // 2

A: Instance block   // 3

A: Constructor       // 5

B: Instance block   // 4

B: Constructor       // 6

Execution Flow Recap:

JVM loads A, executes A's static block.

JVM loads B, executes B's static block.

new B() creates an object of B:

Executes A's instance block.

Executes A's constructor.

After A's constructor finishes, B's instance block executes.

Finally, B's constructor runs.
 * 
 */
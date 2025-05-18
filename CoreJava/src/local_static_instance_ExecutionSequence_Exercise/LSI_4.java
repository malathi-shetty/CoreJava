package local_static_instance_ExecutionSequence_Exercise;

public class LSI_4 {
	
	  // Static block: runs once when class is loaded
    static {
        System.out.println("static blocks");

        {
            System.out.println("block inside static block");
        }
    }

    // Instance block: runs every time an object is created, before constructor
    {
        System.out.println("instance block");
    }

    // Static method
    static void m1() {
        System.out.println("static method");
    }

    // Instance method
    void m2() {
        System.out.println("instance method");
    }

    // Constructor: runs after instance block
    LSI_4() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method starts");

        // Call static method
        LSI_4.m1();

        // Create first object
        System.out.println("Creating first object");
        LSI_4 obj1 = new LSI_4();
        obj1.m2(); // Call instance method

        // Create second object
        System.out.println("Creating second object");
        LSI_4 obj2 = new LSI_4();
        obj2.m2(); // Call instance method

        System.out.println("Main method ends");
    }

}

/*
 * 
 * static blocks
 * 
block inside static block

Main method starts

static method

Creating first object

instance block

Constructor

instance method

Creating second object

instance block

Constructor

instance method

Main method ends

*/


/*

The static block and the nested {} inside it both run only once, when the class is loaded.

Every time you create a new object:

The instance block runs.

Then the constructor runs.

You can also call the instance method.

The static method can be called without creating an object.

*/
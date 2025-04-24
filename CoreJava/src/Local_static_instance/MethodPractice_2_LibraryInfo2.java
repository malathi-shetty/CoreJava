package Local_static_instance;

public class MethodPractice_2_LibraryInfo2 {
	
	

	//Challenge 2: Add Constructor + Local Variable
	/* Extend the Library class:

	Add a constructor that accepts a String studentName and prints "Welcome, <name>!"

	Add a local variable inside the constructor to store a student ID (any number).

	Print both the name and ID from inside the constructor.
*/
	
	 // Constructor
	public MethodPractice_2_LibraryInfo2(String studentName) {
		 int studentID = 101; // Local variable
	        System.out.println("Welcome, " + studentName + "!");
	        System.out.println("Your ID is: " + studentID);
	}
	
	// Static method
    static void libraryHours() {
        System.out.println("Open from 9 AM to 5 PM");
    }

    // Instance method
    void bookIssued() {
        System.out.println("Book issued to student.");
    }

    public static void main(String[] args) {
        // Access static method
    	MethodPractice_2_LibraryInfo2.libraryHours(); // Static method

        // Access instance method
    	MethodPractice_2_LibraryInfo2 lib = new MethodPractice_2_LibraryInfo2("Aarav"); // Constructor
        lib.bookIssued(); // Instance method
    }
}

/*
Output:

Open from 9 AM to 5 PM

Welcome, Aarav!

Your ID is: 101

Book issued to student.

*/
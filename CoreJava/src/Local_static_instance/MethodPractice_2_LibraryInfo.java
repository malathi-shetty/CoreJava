package Local_static_instance;

public class MethodPractice_2_LibraryInfo {

	// Challenge 1: Print Library Info
	/*
	 * Create a class called Library that includes:

A static method called libraryHours() that prints "Open from 9 AM to 5 PM".

An instance method called bookIssued() that prints "Book issued to student."

A main method that:

Calls the static method correctly.

Creates an object of Library and calls the instance method.
	 */
	
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
		MethodPractice_2_LibraryInfo.libraryHours();

        // Access instance method
		MethodPractice_2_LibraryInfo lib = new MethodPractice_2_LibraryInfo();
        lib.bookIssued();

	}

}

/* Output:

Open from 9 AM to 5 PM

Book issued to student.


*/
package Local_static_instance;

public class MethodPractice_1 {

	
		  // 🔹 Static variable
	    static String courseName = "Java Basics";

	    // 🔹 Instance variable
	    String studentName;

	    // 🔹 Constructor (called when object is created)
	    MethodPractice_1(String name) {
	        // Local variable inside constructor
	        String greeting = "Welcome, " + name + "!";
	        System.out.println(greeting);

	        // Assign to instance variable
	        studentName = name;
	    }

	    // 🔹 Static method (belongs to class)
	    static void showCourse() {
	        // Local variable inside static method
	        int duration = 30; // in days
	        System.out.println("Course: " + courseName);
	        System.out.println("Duration: " + duration + " days");
	    }

	    // 🔹 Instance method (belongs to object)
	    void showStudent() {
	        // Local variable inside instance method
	        int id = 101;
	        System.out.println("Student Name: " + studentName);
	        System.out.println("Student ID: " + id);
	    }

	    // 🔹 Main method
	    public static void main(String[] args) {
	        // Local variable inside main
	        String session = "Morning Batch";
	        System.out.println("Session: " + session);

	        // Calling static method (no object needed)
	        showCourse(); // ✅ correct way

	        // Creating object to call instance method
	        MethodPractice_1 mp = new MethodPractice_1("Aarav");

	        // Calling instance method
	        mp.showStudent();
	    

	}

}


/*Output:
 * 
 * Session: Morning Batch
 * 
Course: Java Basics

Duration: 30 days

Welcome, Aarav!

Student Name: Aarav

Student ID: 101


 */









/*

One static method

✅ One instance method

✅ A constructor

✅ Local variables


1. When is memory allocated for the instance variable studentName?

A) When the method is called

B) When the class is loaded

C) When the object is created - ✅

2. How do you access the static method showCourse() from main()?

A) By creating an object

B) Directly or using the class name - ✅

C) It cannot be accessed

3. Can a static method directly access the instance variable studentName?

A) Yes

B) No - ✅

4. Where can the variable greeting be used?

A) Only inside the constructor - ✅

B) In all methods

C) Inside main()

5. What’s the correct way to call the instance method showStudent()?

A) showStudent();

B) MethodPractice.showStudent();

C) mp.showStudent(); - ✅

*/
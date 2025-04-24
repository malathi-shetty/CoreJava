package Local_static_instance;

public class MethodPractice_3_StudentProfile {
	
	// Challenge 3: Build a Class with All Three Variable Types
/*	Make a class called StudentProfile with:

		A static variable called schoolName = "Green Valley High".

		An instance variable called studentGrade.

		A constructor that sets studentGrade.

		A method displayProfile() that prints:

		School name (accessing static variable)

		Student grade (accessing instance variable)

		In main(), do the following:

		Print school name using the class name

		Create a student with grade “10th”

		Call the display method
*/
	
	
	
	 static String schoolName = "Green Valley High"; // Static variable
	    String studentGrade; // Instance variable

	    // Constructor
	    MethodPractice_3_StudentProfile(String grade) {
	        studentGrade = grade;
	    }

	    void displayProfile() {
	        System.out.println("School: " + schoolName); // Static variable
	        System.out.println("Grade: " + studentGrade); // Instance variable
	    }

	    public static void main(String[] args) {
	        System.out.println("School: " + MethodPractice_3_StudentProfile.schoolName); // Access static variable

	        MethodPractice_3_StudentProfile student = new MethodPractice_3_StudentProfile("10th");
	        student.displayProfile(); // Call method
	    }
}
/*
output:

School: Green Valley High

School: Green Valley High

Grade: 10th

*/
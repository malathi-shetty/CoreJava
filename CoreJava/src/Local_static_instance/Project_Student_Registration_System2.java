package Local_static_instance;

import java.util.Random;

public class Project_Student_Registration_System2 {
	// RANDOM GRADES ADDED + OUTPUT CHANGES DONE
	
	
	/*
	 * Project: “Student Registration System”

This mini project will help you apply:

Static & instance variables/methods

Local variables

Constructors

Basic object-oriented structure

🔧 Requirements:
Store the school name using a static variable.

Each Student has:

Name

Grade

Unique ID (use constructor to set)

Include:

A static method to display the school info

An instance method to display student info

A main method that:

Registers 2 students

Displays all info

Add a subject list (array or list)

Add a method to update grades

Create a static counter to auto-increment unique student IDs
	 */
	
	 // 🔹 Static counter for auto-incrementing student IDs
    static int idCounter = 0;
    
	// Static variable
    static String schoolName = "Skyline International School";

    // Instance variables
    int studentId;
    String name;
    String[] subjects;
    double[] grades;

    // Static method
    static void displaySchoolInfo() {
        System.out.println("🏫 School Name: " + schoolName);
    }

    // Constructor
    Project_Student_Registration_System2(String name, String[] subjects) {
        this.name = name;
        this.subjects = subjects;
        this.studentId = ++idCounter; // Auto-generated ID
      //  this.grades = new double[subjects.length]; // Initially 0 for all -  Initialize grades to 0.0
        
        // 🎲 Assign random grades between 60.0 and 100.0
        this.grades = new double[subjects.length];
        Random rand = new Random();
        for (int i = 0; i < grades.length; i++) {
            grades[i] = 60 + (rand.nextDouble() * 40); // 60.0 to 100.0
        }
    }

    // Instance method: Display student info
    /*    void displayStudentInfo() {
    	System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Subject: " + subjects[i] + " | Grade: " + grades[i]);
        }
       
    	    System.out.println("---------------------------");
        
        System.out.println("🎓 Student ID: " + studentId);
        System.out.println("👤 Name      : " + name);
        System.out.println("📚 Subjects & Grades:");
        System.out.println("-----------------------------");
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("• %-10s | Grade: %.1f%n", subjects[i], grades[i]);
        }
        System.out.println("-----------------------------\n");
     
    } */
    
 // ANSI color codes
    static final String RESET = "\u001B[0m";
    static final String GREEN = "\u001B[32m";
    static final String CYAN = "\u001B[36m";
    static final String YELLOW = "\u001B[33m";
    static final String BLUE = "\u001B[34m";

    // Instance method: Display student info
    void displayStudentInfo() {
        System.out.println(BLUE + "🎓 Student ID: " + studentId + RESET);
        System.out.println(CYAN + "👤 Name      : " + name + RESET);
        System.out.println(YELLOW + "📚 Subjects & Grades:" + RESET);
        System.out.println(GREEN + "-----------------------------" + RESET);
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("• %-10s | Grade: %.1f%n", subjects[i], grades[i]);
        }
        System.out.println(GREEN + "-----------------------------\n" + RESET);
    }
    
    // 🔹 Instance Method: Update grade for a subject
    void updateGrade(String subject, double newGrade) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i].equalsIgnoreCase(subject)) {
                grades[i] = newGrade;
                System.out.println("✅ Updated grade for " + subject + " to " + newGrade);
                return;
            }
        }
        System.out.println("❌ Subject not found: " + subject);
    }

    // 🔹 Main method to test functionality
    public static void main(String[] args) {
        // Local variable
        int totalStudents = 4;
        System.out.println("📋 Registering " + totalStudents + " students...\n");

        // Display school info
        displaySchoolInfo();

        // 🔹 Register Students
        String[] sub1 = {"Math", "English", "Science"};
        Project_Student_Registration_System2 s1 = new Project_Student_Registration_System2("Aanya", sub1);

        String[] sub2 = {"History", "Math"};
        Project_Student_Registration_System2 s2 = new Project_Student_Registration_System2("Rohan", sub2);
        
        String[] sub3 = {"Math", "English", "Science"};
        Project_Student_Registration_System2 s3 = new Project_Student_Registration_System2("Alice", sub3);
        
        String[] sub4 = {"History", "Math"};
        Project_Student_Registration_System2 s4 = new Project_Student_Registration_System2("Bob", sub4);

     // 🔹 Display Info
        System.out.println("\n--- Student 1 Info ---");
        s1.displayStudentInfo();

        System.out.println("\n--- Student 2 Info ---");
        s2.displayStudentInfo();
        
        System.out.println("\n--- Student 3 Info ---");
        s3.displayStudentInfo();

        s3.updateGrade("Math", 92.5);
        s3.updateGrade("Social Studies", 88);
        s3.displayStudentInfo();

        // Another student
        
        
        System.out.println("\n--- Student 4 Info ---");
        s4.displayStudentInfo();
        
    }

}


/*
 * 
 * 1. What is the best way to access a static method?
 * 
A) obj.method()

B) ClassName.method() ✅

C) Inside constructor

D) Through user input

2. When is memory allocated for an instance method?

A) When class is loaded

B) When method is called

C) When object is created ✅

D) During compile time

3. What is a constructor used for?

A) Delete variables

B) Print output

C) Initialize objects ✅

D) None of the above

*/


// ❓Why are all grades 0.0 at first?
/*Because when the student is created, grades = new double[subjects.length]; initializes the array with default values (0.0). That's why each grade starts as 0.0 until updated using updateGrade().
*/




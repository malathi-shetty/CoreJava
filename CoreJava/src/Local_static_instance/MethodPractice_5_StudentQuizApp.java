package Local_static_instance;

public class MethodPractice_5_StudentQuizApp {
	//Challenge 5: Bonus — Student Quiz App
/*	Create a class Quiz that:

		Has a static method rules() that prints quiz rules.

		Has an instance method startQuiz() that prints a question and answer choices.

		Uses a constructor that welcomes the student by name.

		In main():

		Print the rules

		Create a student and start the quiz
		*/
	
	// Static method
	static void rules() {
		System.out.println("📝 Quiz Rules: Answer honestly. No cheating!");
	}
	
	// Instance method
	void startQuiz(){
		 System.out.println("Q1: What is 5 + 3?");
	        System.out.println("\nA) 6  \nB) 7  \nC) 8  \nD) 9");
	        System.out.println("Correct Answer: C");
	}
	
	 // Constructor
	MethodPractice_5_StudentQuizApp(String studentName) {
        System.out.println("Welcome to the quiz, " + studentName + "!");
    }
	
	public static void main(String[] args) {
		 rules(); // Static method
		 MethodPractice_5_StudentQuizApp q = new MethodPractice_5_StudentQuizApp("Aisha"); // Constructor
	        q.startQuiz(); // Instance method
	}

}

/* output:

📝 Quiz Rules: Answer honestly. No cheating!

Welcome to the quiz, Aisha!

Q1: What is 5 + 3?

A) 6  B) 7  C) 8  D) 9

Correct Answer: C

*/
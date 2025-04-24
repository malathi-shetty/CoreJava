package Local_static_instance;

public class MethodPractice_4_Demo {
//Challenge 4: Fix the Errors!
/*	Here’s some broken code — fix the errors so it runs properly:

		public class Demo {
		    static void staticMessage() {
		        System.out.println("Static call");
		    }

		    void instanceMessage() {
		        System.out.println("Hello from instance");
		    }

		    public static void main(String[] args) {
		        staticMessage;
		        Demo.instanceMessage();
		    }
		}
		❓ What’s wrong here?

		How should static and instance methods be accessed?
				
				*/
	
	 static void staticMessage() {
	        System.out.println("Static call");
	    }

	    void instanceMessage() {
	        System.out.println("Hello from instance");
	    }

	    public static void main(String[] args) {
	        staticMessage(); // Correct static call
	        
	        MethodPractice_4_Demo newobj = new MethodPractice_4_Demo();  // Correct instance call
	        newobj.instanceMessage();
	    }
	
}

/* output:

Static call

Hello from instance

*/
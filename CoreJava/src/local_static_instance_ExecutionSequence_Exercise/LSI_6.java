package local_static_instance_ExecutionSequence_Exercise;

public class LSI_6 {

	/*
	 * Calling a static method from an instance method ✅
	 * 
	 * Calling an instance method from a static method ✅
	 * 
	 * Added a Counter to Limit Recursion (for testing only) since needed to stop
	 * the recursion by preventing the mutual method calls from continuing
	 * endlessly.
	 */

	static int callCount = 0;

	// Static method
	static void staticMethod() {
		System.out.println("Inside static method");

		// To call an instance method, create an object

		if (callCount < 3) {
			callCount++;
			LSI_6 obj = new LSI_6();
			obj.instanceMethod(); // ✅ allowed
		}
	}

	// Instance method
	void instanceMethod() {
		System.out.println("Inside instance method");

		// Can directly call static method from here
		if (callCount < 3) {
			staticMethod(); // ✅ allowed
		}
	}

	public static void main(String[] args) {
		System.out.println("Main method starts");

		// Call static method directly
		staticMethod();

		// Create an object and call instance method
		LSI_6 demo = new LSI_6();
		demo.instanceMethod();

		System.out.println("Main method ends");
	}

}

/*
 * 
 * 
 * ❓ Can Static and Instance Methods Be Nested Within Each Other?
 * 
 * 🔴 No, you cannot define (declare) a method inside another method — whether
 * it's a static or instance method.
 * 
 * Java does not allow method declarations inside other methods, regardless of
 * whether they’re static or instance methods.
 * 
 * ⚠️ Illegal Example (Won’t Compile)
 * 
 * static void outerStaticMethod() {
 * 
 * void innerInstanceMethod() { // ❌ Not allowed!
 * 
 * System.out.println("Inner method"); } }
 * 
 * Or:
 * 
 * 
 * void outerInstanceMethod() {
 * 
 * static void innerStaticMethod() { // ❌ Not allowed!
 * 
 * System.out.println("Inner static method"); } }
 * 
 * Both examples above will give you a compilation error: illegal start of
 * expression
 * 
 * 
 * ✅ What You Can Do
 * 
 * Call a static method from an instance method:
 * 
 * void instanceMethod() {
 * 
 * System.out.println("Inside instance method");
 * 
 * staticMethod(); // ✅ allowed }
 * 
 * 
 * Call an instance method from a static method (using an object):
 * 
 * 
 * static void staticMethod() {
 * 
 * System.out.println("Inside static method");
 * 
 * LSI_1 obj = new LSI_1();
 * 
 * obj.instanceMethod(); // ✅ allowed }
 * 
 * 🧠 Summary
 * 
 * Scenario Allowed
 * 
 * Declare method inside another method ❌ No
 * 
 * Call static method from instance method ✅ Yes
 * 
 * Call instance method from static method ✅ Yes (via object)
 * 
 * Declare static method inside instance method ❌ No
 * 
 * ---
 * 
 * Output:
 * 
 * Main method starts
 * 
 * Inside static method
 * 
 * Inside instance method
 * 
 * Inside static method
 * 
 * Inside instance method
 * 
 * Inside static method
 * 
 * Inside instance method
 * 
 * Inside instance method ← This is the one from the explicit
 * `demo.instanceMethod();` in `main()`
 * 
 * Main method ends
 * 
 * 
 * 
 * Explanation
 * 
 * main() calls staticMethod() → prints "Inside static method"
 * 
 * staticMethod() creates an object and calls instanceMethod() → prints
 * "Inside instance method"
 * 
 * main() then calls instanceMethod() on an object → again prints
 * "Inside instance method"
 * 
 * instanceMethod() itself calls staticMethod() again → so it prints
 * "Inside static method" and again calls instanceMethod()
 * 
 * 
 * 
 * 
 * 
 * 
 * Why You See One Extra "Inside instance method"
 * 
 * That extra line comes from this part of your main():
 * 
 * LSI_6 demo = new LSI_6();
 * 
 * demo.instanceMethod(); // ← this runs independently of the recursion above
 * 
 * It runs after the recursive/static call chain is complete.
 * 
 * 
 * If You Don’t Want That Extra Call
 * 
 * Just remove the second instance method call from main():
 * 
 * // demo.instanceMethod(); ← optional, remove if you want to avoid that line
 * 
 * 
 * 
 * Step-by-Step Execution with callCount Tracing
 * 
 * Step →	callCount  →  What Happens → Output Line
 * 
 * 1	→	 0 → main() calls staticMethod() → "Main method starts"
 * 
 * 2 → 0 → 1 → Prints "Inside static method" → "Inside static method"
 * 
 * 3  → 1  → instanceMethod() called  → "Inside instance method"
 * 
 * 4  → 1 → 2 instanceMethod() calls staticMethod()  →  "Inside static method"
 * 
 * 5  → 2  → instanceMethod() called again →  "Inside instance method"
 * 
 * 6  → 2 → 3 staticMethod() called again  → "Inside static method"
 * 
 * 7  → 3 →  instanceMethod() called again →  "Inside instance method"
 * 
 * 8  → n/a →  callCount >= 3, recursion ends
 * 
 * 9  → n/a  → Back in main() →  demo.instanceMethod()
 * 
 * 10  → 3  → Print "Inside instance method"  → ✅ This is your extra line
 * 
 * 11  → 3  → Doesn't call staticMethod (limit reached)
 * 
 * 12  → n/a  → Print "Main method ends"  → "Main method ends"
 * 
 * 
 * 
 */

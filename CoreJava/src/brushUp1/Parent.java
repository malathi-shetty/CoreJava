package brushUp1;

public class Parent {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("I Navigated to Home Page");

		Parent_Methods pm = new Parent_Methods();
		// ClassObject.methodName

		System.out.println(pm.ValidateHeader()); // Header links are Validated & 10

		pm.ValidateBody(); // Body links are Validated

		System.out.println(pm.ValidateFooter()); // Footer links are Validated & Pass

	}
}
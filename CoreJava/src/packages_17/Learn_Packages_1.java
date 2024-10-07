package packages_17;

public class Learn_Packages_1 {

	// Class A can use the Class B directly by creating object if both Class A &
	// Class B belongs to same package
	int i = 5; // default access, accessible only within the package
	public int a = 10; // public access, accessible from any package

	private int b = 10; // private access: Cannot access modifier method or variable
						// outside the class or same package

	public void abc() {
		System.out.println("Hello from abc");
	}

	void xyz() { // default
		System.out.println("Hello from xyz");
	}

	private void lmp() {
		System.out.println("Hello from lmp");
	}

	// protected: variable/method as protected, you can access those in + subclasses
	// only..
	protected void qrs() {
		System.out.println("Hello from qrs");
	}

	public static void main(String[] args) {
		Learn_Packages_1 lp = new Learn_Packages_1();
		lp.abc();
		lp.xyz();
		System.out.println("i: " + lp.i); // Outputs 5
		System.out.println("a: " + lp.a); // Outputs 10
	}
}
package packages_17;

public class Learn_Packages_2 {
	public static void main(String[] args) {
		Learn_Packages_1 lp = new Learn_Packages_1();
		lp.abc();
		lp.xyz(); // Now accessible
		// lp.qrs();
		System.out.println("i: " + lp.i); // Outputs 5
		System.out.println("a: " + lp.a); // Outputs 10
		// lp.b;
		// lp.lmp();
	}
}
package packages_demo_17_2;

import packages_17.Learn_Packages_1;

public class Learn_Packages_2 {

	// import packages_17.Learn_Packages_1; no idea from which package it is been
	// asking so user-defined package
	// kind of consistency eg:
	// payment page you have to click on buy class after entering - used in payment
	// package
	// buyclass is also able to handle for coupons - used in coupons package

	// inbuilt is java.lang, java.util

	public static void main(String[] args) {
		Learn_Packages_1 lp = new Learn_Packages_1();
		lp.abc(); // This is accessible
		System.out.println("a: " + lp.a); // Accessible since 'a' is public
		// lp.xyz(); // Uncommenting this will cause error (xyz is default access)
		// System.out.println("i: " + lp.i); // Uncommenting this will cause error (i is
		// default access)
		// lp.b;
		// lp.lmp();
		// lp.qrs();
	}
}
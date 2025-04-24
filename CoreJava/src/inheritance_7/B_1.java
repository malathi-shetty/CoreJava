package inheritance_7;

public class B_1 extends A_1{
	
	{
		int i = 20; // b.i directly accesses B's instance variable i, which is inherited from A and set to 10, so b.i prints 10.
	//This initializes a local variable i with a value of 20. It does not affect the instance variable i inherited from class A.
	// if u remove int & remove below i-values then it will take this value & not from parent for a.i & b.i; else due to ambuigity it will take parents
	}
	
	
	int i = 30;
	{
		i = 40;
		// This instance initializer block assigns 40 to the inherited instance variable i from class A
	}
	// OR swap this two & output would be altered for B b = new B();
//	int i = 30;
	// This variable declaration inside class B shadows (hides) the inherited instance variable i from class A. 
	//Now, B has its own instance variable i initialized to 30.
	

	public static void main(String[] args) {

		A_1 a = new B_1();
		//Webdriver driver = new chromeDriver();
		System.out.println(a.i);
		// a.i refers to the instance variable i of the object created (new B()). 
		//Since A's instance variable i is inherited by B and is 10, a.i prints 10, not 20
// a is of type A but refers to an instance of B. When a.i is accessed, it refers to the instance variable i of the object created (new B()). 
		//Since A's instance variable i is inherited by B and is 10, a.i prints 10.		
		
		B_1 b = new B_1();
		System.out.println(b.i);
//b is of type B and refers to an instance of B. When b.i is accessed, 
//it directly accesses B's own instance variable i, which is 30 (due to the declaration int i = 30; in class B). Therefore, b.i prints 30.
	}

}

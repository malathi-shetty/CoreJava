package constructor_11;

public class Parameterized_ConstructorDemo {

	// Even if a single constructor is present, implicit constructor wont execute
	// since u have mentioned 1 constructor already

	public Parameterized_ConstructorDemo() // Constructor should not return any values
	{
		System.out.println("I am the Constructor");

		System.out.println("******");
	}

	// Parameterized Constructor
	public Parameterized_ConstructorDemo(int a, int b) {

		int c = a + b;
		System.out.println("I am the int Parameterized Constructor: " + c);
		System.out.println("---");

	}

	public Parameterized_ConstructorDemo(String s) {
		System.out.println("I am the String Parameterized Constructor: " + s);
	}

	public void getdata() {
		System.out.println("I am the method"); // expecting some return value so written void
	}

	public static void main(String[] args) {

		 Parameterized_ConstructorDemo pd = new Parameterized_ConstructorDemo();

		 Parameterized_ConstructorDemo pd1 = new Parameterized_ConstructorDemo(4,5);

		Parameterized_ConstructorDemo pd2 = new Parameterized_ConstructorDemo("hello");

	}

}

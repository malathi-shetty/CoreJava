package brushUp1;

public class CoreJavaBrushUp6 {

	public static void main(String[] args) {
		// create method & access the method

		// method means block of code that is going to repeated many times so instead of
		// rewriting code number of times, method is called
		// methods are not written inside the main method since its is used for
		// execution purpose. so we declare the methods outside the main method since we
		// are declaring the methods but we are not saying to execute the methods until
		// needed for execution
		// methods can be used in any classes
		// methods do not return anything simply put void. if it returns then put int or
		// String
		// void - exceute something but doesnt return anything

		CoreJavaBrushUp6 d = new CoreJavaBrushUp6();
		String name = d.getStringData();
		System.out.println(name);

		System.out.println("***");

		d.getData();

		System.out.println();

		System.out.println("*CoreJavaBrushUp7 Class*");
		CoreJavaBrushUp7 d1 = new CoreJavaBrushUp7();
		String name1 = d1.getUserData();
		System.out.println(name1);

		System.out.println();
		getUserStringData(); // no object is created
	}

	public void getData() {
		System.out.println("Hello World");
	}

	public String getStringData() {
		return "rahul shetty";
	}
	
	// By making static method belongs to class level & NOT Object
	public static String getUserStringData() { 
		System.out.println("Hello World Static methods");
		return "Automation";
	}

}

package overloading_and_overriding_8;

// Rules of Method_Overloading:
//Either argument count should be different
//OR Argument data type should be different


public class Method_Overloading {
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}
	
	
	public void getData(int a, int b)
	{
		System.out.println(b);
	}
	
	
	

	public static void main(String[] args) {
		
		Method_Overloading m1 = new Method_Overloading();
		m1.getData(2);
		m1.getData("hello");
		m1.getData(2, 5);

	}

}

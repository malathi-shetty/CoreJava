package static_Instance;

public class ChildClass extends ParentClass {

	void m1() {
		System.out.println("Child class");
	}
	
	public static void main(String[] args) {
		ParentClass newobj = new ParentClass();
		newobj.m1();  // Parent class
		
		
		ChildClass newobj1 = new ChildClass();
		newobj1.m1(); // Child class
		
		ParentClass newobj2 = new ChildClass();
		newobj2.m1(); // Child class
	}
}
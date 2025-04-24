package static_Instance;

public class Static_ChildClass2 extends Static_ParentClass2 {

	static void m1() {
		System.out.println("Child static");
	}
	
	static void m2(int a) {
		  System.out.println("Child static m2(int)");
	}
	
	static void m2(int a, int b) {
		System.out.println("Child static m2(int, int)");
	}
	
	public static void main(String[] args) {
		Static_ParentClass2 newobj = new Static_ParentClass2();
		newobj.m1();  // Parent static
		
		
		Static_ChildClass2 newobj1 = new Static_ChildClass2();
		newobj1.m1(); // Child static
		newobj1.m2(5);// Output: Child static m2(int)
		newobj1.m2(10, 20);// Output: Child static m2(int, int)
		
		Static_ParentClass2 newobj2 = new Static_ChildClass2();
		newobj2.m1(); // Output: Parent static (because static method is bound to reference type)
	}
}

/*
output:
Parent static
Child static
Child static m2(int)
Child static m2(int, int)
Parent static

*/
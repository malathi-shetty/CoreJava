package static_Instance;

public class Static_ChildClass extends Static_ParentClass {

	static void m1() {
		System.out.println("Child static");
	}
	
	public static void main(String[] args) {
		Static_ParentClass newobj = new Static_ParentClass();
		newobj.m1();  // Parent static
		
		
		Static_ChildClass newobj1 = new Static_ChildClass();
		newobj1.m1(); // Child static
		
		Static_ParentClass newobj2 = new Static_ChildClass();
		newobj2.m1(); // Parent static
	}
}
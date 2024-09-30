package super_keyword;

public class Super_ChildClass extends Super_ParentClass {
	
	String name ="Concept to learn";
	
	public void getStringdata()
	{
		
		System.out.println(name); // child class variable
		System.out.println(super.name); // parent class variable
		
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am in Child Class");
	}
	
	
	public Super_ChildClass()
	{
		super(); // Invokes constructor of parent class; Rule: super should always be at first line in child constructor
		System.out.println("I am Child class Constructor");
	}
	
	
	public static void main(String[] args) {
		
		Super_ChildClass sc = new Super_ChildClass(); // child class - give preference to local variable
		sc.getStringdata();
		sc.getData();
		
		
	}

}

package inheritance_7;

public class ChildClass_3 extends ParentClass_3 {
	
	String name = "shetty";
	
	public ChildClass_3()
	{
		System.out.println("Child Class constructor");
	}
	
	public void getStringdata()
	{
		System.out.println("getStringdata - Surname: "  + name);
		System.out.println("getStringdata - Parent Name: " + super.name);
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("Child - getData: I am in Child Class");
	}
	
	
	

	public static void main(String[] args) {
		
		ChildClass_3 cc = new ChildClass_3();
		cc.getData();
		cc.getStringdata();

	}

}

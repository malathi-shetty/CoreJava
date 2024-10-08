package inheritance_7;

public class ChildClass_2 extends ParentClass_2{
	
	public void engine()
	{
		System.out.println("new engine");
	}
	
	public void colour()
	{
		System.out.println(colour);
	}
	

	public static void main(String[] args) {
		
		ChildClass_2 cc =	new ChildClass_2 ();
		cc.colour();
		cc.AudioSystem();
		cc.Gear();
		cc.Brakes();
		cc.engine();
		
	}

}

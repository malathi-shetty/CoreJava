package overloading_and_overriding_8;

//Rules: method override - same name, same signature, same parameters

public class Child_Method_Overriding extends Parent_Method_Overriding{
	
	
	public void AudioSystem()
	{
		System.out.println("Child - New audio is implemented"); // override parent class
	}
	
	public void engine()
	{
		System.out.println("Child - New engine is implemented");
	}
	
	public void colour()
	{
		System.out.println("Parent - " + colour);
	}
	

	public static void main(String[] args) {

		Child_Method_Overriding cm = new Child_Method_Overriding ();
		cm.colour();
		cm.AudioSystem(); // method override - same name, same signature, same parameters
		cm.Gear();
		cm.Brakes();
		cm.engine();

	}
}

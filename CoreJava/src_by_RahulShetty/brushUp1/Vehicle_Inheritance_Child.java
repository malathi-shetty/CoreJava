package brushUp1;

public class Vehicle_Inheritance_Child extends Vehicle_Inheritance_Parent{

	
	public void Engine()
	{
		System.out.println("New Engine code is implemented");
	}
	public void colour()
	{
		System.out.println("Parent-colour in child class: " + colour);
	}
	
	public static void main(String[] args) {

		Vehicle_Inheritance_Child vc = new Vehicle_Inheritance_Child();
		vc.colour();
		vc.AudioSystem();
		vc.Brakes();
		vc.Engine();
		vc.Gear();
	}

}

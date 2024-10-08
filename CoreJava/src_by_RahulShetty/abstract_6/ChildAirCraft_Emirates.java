package abstract_6;

public class ChildAirCraft_Emirates extends ParentAirCraft {

	public static void main(String[] args) {
		
		//ParentAirCraft pc = new ParentAirCraft(); // Cannot create the object for ParentAirCraft since its marked as Abstract class
		
	
		
		ChildAirCraft_Emirates cc= new ChildAirCraft_Emirates();
		cc.safetyGuidelines(); // always have public access modifier
		cc.engine();
		cc.bodyColor();
	}

	@Override
	public void bodyColor() {

		System.out.println("Body Color of Emirates Flight: White, Red");
		
	}

}

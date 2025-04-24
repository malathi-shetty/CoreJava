package Local_static_instance;

public class Local_static_instance_METHOD {
	
	// 🔹 Static Method
	static void m1(){ 
		System.out.println("Static Method");
	}
	
	// 🔹 Instance Method
	 void m2(){ 
		System.out.println("Instance Method");
	}
	
	

	public static void main(String[] args) {
		//Access static method: By directing calling the method, object  or using class name
		// creating an object is not recommended for static
		// when class is loaded, first it checks if there is any static variable or method
		
		Local_static_instance_METHOD.m1();
		
		//Access instance method: By creating an object
		
		Local_static_instance_METHOD lm = new Local_static_instance_METHOD();
		lm.m2();
		
		
		 // ⚠️ No local method used here (e.g., method declared inside another method, which isn't valid in Java)

	}

}

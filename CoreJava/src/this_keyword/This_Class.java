package this_keyword;

public class This_Class {
	
	//this refers to current object
	// object scope lies in class level
	
	
int a = 4; // global variable
	
	public void getData()
	{
		int a = 5; // local variable
		System.out.println(a);
		System.out.println(this.a);
		
		int c = a + this.a;
		System.out.println(c);
	}


	public static void main(String[] args) {
	
		This_Class tc = new This_Class();
		tc.getData();
	}

}

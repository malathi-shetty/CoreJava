package loop_3;

public class Nested_For_Loops_6 {

	public static void main(String[] args) {

 		for(int i=1;i<=4;i++) // this block will loop_3 for 4 times - Outer For Loop
		{
			System.out.println("Outer loop_3 Started");
			for(int j=1; j<=4; j++) // Inner for Loop -  this block will also loop_3 for 4 times
			{
				System.out.println("Inner Loop");
			}
			System.out.println("Outer loop_3 Finished");
		}

	}

}

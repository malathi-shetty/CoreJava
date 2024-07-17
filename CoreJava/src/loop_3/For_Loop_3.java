package loop_3;

public class For_Loop_3 {

	public static void main(String[] args) {
      
		// 1 to 10
		
		//for(initialization; condition; increment){}
	
		System.out.println("*** 1 ***");
		
		for(int i=0; i<5;i++)//condition till it reaches 100
		{
			System.out.println(i);
		}
		
		System.out.println("*** 2 ***");
		
		for(int i=5; i<3;i++)//condition till it reaches 100
		{
			System.out.println(i);
		}
		System.out.println("** 5<3 - condition wont execute & comes out of the loop_3**");
		
		System.out.println("*** 3 ***");
		
		for(int i=0; i<10;i=i+2)//condition till it reaches 100
		{
			System.out.println(i);
		}

	}

}

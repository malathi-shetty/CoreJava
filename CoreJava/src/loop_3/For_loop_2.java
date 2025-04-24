package loop_3;

public class For_loop_2 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i=i+2)
		{
			if(i==8)
				System.out.println("8 is displayed");
			else
				System.out.println("I didnot find it");
		}
		
		System.out.println("****");
		
		for(int i=0; i<10; i=i+2)
		{
			if(i==9)
				System.out.println("9 is displayed");
			else
				System.out.println("I didnot find it");
		}

	}

}

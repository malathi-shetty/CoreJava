package loop_3;

public class Code_printing_pyramid_triangle_7 {

	public static void main(String[] args) {
		// 1 2 3 4
		// 5 6 7
		// 8 9
		// 10
		
		int k=1;
		
		for(int i=0; i<4;i++)
		{
		//	System.out.println("outer loop_3 started");
			for(int j=1; j<=4-i;j++)
			{
				System.out.print(k);
				System.out.print("\t "); // space
				k++;
			}
			System.out.println(" ");
		//	System.out.println("outer loop_3 finished");
		}


	}

}

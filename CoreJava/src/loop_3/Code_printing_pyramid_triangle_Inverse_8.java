package loop_3;

public class Code_printing_pyramid_triangle_Inverse_8 {

	public static void main(String[] args) {
		/*
		 *	1	
		  	2	3	
			4	5	6	
			7	8	9	10	
		 */

		int k =1;
		for(int i=0;i<4;i++)
		//for(int i=1;i<5;i++)
		{
			for (int j=1; j<=i+1;j++)
			//for (int j=1; j<=i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
				
			}
			System.out.println("");
		}

	}

}

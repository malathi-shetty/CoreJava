package array_9;

public class Arrays_Demo_4_MultiDimennsional_2 {

	public static void main(String[] args) {

		int a[][] = new int [2][3]; // 2-rows, 3-columns
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		
		for(int i=0; i<2; i++) // stands for row
		{
			for(int j=0;j<3;j++) // stands for column
			{
				
				System.out.println(a[i][j] );
			
			}
			
		}
	
	}

}

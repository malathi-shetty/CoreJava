package exercise_9;

public class Print_largest_number_in_3x3_matrix_2 {

	public static void main(String[] args) {
		
		// 2 4 5
		// 3 4 7
		// 1 2 9
		
		
		int xyz [][]= {{2,11,5}, {3,10,7}, {1,2,9}};
		
		int max =xyz[0][0];
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(xyz[i][j]> max)
				{
					max=xyz[i][j];
				}
			}
		}
		System.out.println(max);

	}

}

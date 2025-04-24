package exercise_9;

public class Print_smallest_number_in_3x3_matrix_1 {

	public static void main(String[] args) {
		
		// 2 4 5
		// 3 4 7
		// 1 2 9
		
		
		int abc[] [] = {{2,4,5},{3,0,7},{1,2,9}};
		
		int min =abc[0][0];
		for(int i=0; i<3;i++) // row
		{
			for(int j=0; j<3; j++) // column
			{
				if(abc[i][j]<min) { 
					min = abc[i][j];
				
				}
			}
		}
		System.out.println(min);

	}

}

package exercise_9;

public class Print_smallestNumberFromRow_LargetsNumberFromColumn_in_3x3_matrix_2 {

	public static void main(String[] args) {
		
		//wherever i get minimum number on Row, i have to find largest number from same column
		// 2 4 5
		// 3 0 7
		// 1 10 9
		
		// Row - 0; Column - 4 : Row:1_Column:1
		/*
		 * Step 1: Find the minimum number
		 * Step 2: Identify the column of minimum number
		 * Step 3: Fine the maximum number in identified column
		 */
		
		
		int abc[][]= {{2,4,5}, {3,0,7}, {1,10,9}};
		int min = abc[0][0]; //i-row; j- column
		int minColumn = 0;
		for(int i=0; i<3; i++) // row
		{
			for(int j=0; j<3; j++) // column
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
					minColumn=j;
				}
			}
		}
		System.out.println("min row value: " + min);
		
		int k=0;
		int max=abc[0][minColumn];
		while(k<3)
		{
			if(abc[k][minColumn] > max)
			{
				max = abc[k][minColumn];
			}
			k++;
				
		}
		System.out.println("max column value: " + max);

	}

}

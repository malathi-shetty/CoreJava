package array_9;

public class Arrays_Demo_3_multiDimensional {

	public static void main(String[] args) {
		// multidimensional array - X-axis & y-axis - [][] - [represents  X-axis][ represents  Y-axis]
		// 2 4 5 (0th row 0th column , 0th row 1st column, 0th row 2nd column)
		// 3 4 7 (1st row 0th column , 1st row 1st column, 1st row 2nd column)
		// 1 2 6 (2nd row 0th column , 2nd row 1st column, 2nd row 2nd column)
		
		//a[row][column]
		// 2 4 5
		// 3 4 7

		int a[][] = new int [2][3]; // 2-rows, 3-columns
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		
		// write 2nd row 1st column i.e 3
		
		System.out.println("a-2 row: " + a[1][0]);
		
	//	[][]= {{0th row, 0th column}{1st row, 1st column}};
//		[][]= {{0,0  0,1   0,2}{1,0  1,1   1,2}};
		int  b[][]= {{2, 4, 5}, {3 ,4, 7}, {5,2,1}};
		System.out.println("b-3 row: " + b[2][1]);
		
		

	}

}

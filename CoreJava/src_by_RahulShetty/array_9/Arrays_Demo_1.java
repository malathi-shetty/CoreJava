package array_9;

public class Arrays_Demo_1 {
	
	// Array -  multiple value in a single container of same data type is Array

	public static void main(String[] args) {


	/*	int a = 4; // single value 
		
		int b;
		b =5;
	*/	
		// A container which stores multiple values of same data type
		
		int a[] = new int [5]; // 5 values in integer needs to be stored in array of same data type.
		int b[] = new int [10]; // declares an array and allocates memory for the values
		
		a[0] =2;
		a[1] =6;
		a[2] =1;
		a[3] =9;
		a[4] =12; // initialized values into that array
		
		for(int i=0; i<a.length;i++) // length is of array
		{
			System.out.println(a[i]); // retrieves values present in the array
		}

	}

}

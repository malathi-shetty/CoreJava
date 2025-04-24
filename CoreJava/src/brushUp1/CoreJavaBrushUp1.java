package brushUp1;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		int myNum = 5;
		System.out.println(myNum + " is the value stored in the myNum variable");
		
		System.out.println();

		char letter = 'r';

		double dec = 5.99;

		boolean myCard = true;

		// Arrays -

		int[] arr = new int[5];// 5, 10

		arr[0] = 1;

		arr[1] = 2;

		arr[2] = 4;

		arr[3] = 5;

		arr[4] = 6;

		// for loop arr.length - 5
		System.out.println("print values of array: ");
		for (int i = 0; i < arr.length; i++) // 4

		{

			System.out.println(arr[i]);

		}

		System.out.println();
		int[] arr2 = { 10, 20, 40, 50, 60 };

		System.out.println("arr2[0]: " + arr2[0]);
		System.out.println();
		System.out.println("print values of array2: ");
		for (int i = 0; i < arr2.length; i++)

		{

			System.out.println(arr2[i]);

		}
		
	}

}

package exceptions_demo_14;

public class Exceptions_Class_ArithmeticException {
	
	//This occurs when an arithmetic operation is performed that is not defined, such as division by zero.
	//when finally block wont execute: when we stop JVM forcefully

	public static void main(String[] args) {
		// Unchecked Exceptions - This occurs when an arithmetic operation is performed
		// that is not defined, such as division by zero.
		
		int b=7;
		int c=0;
		
		int arr[] = new int[5];
		
		try {
		//	int result = b / c;
			
			System.out.println(arr[7]);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occurred: " + e.getMessage());
		}  catch (IndexOutOfBoundsException ie) {
			System.out.println("IndexOutOfBounds Exception occurred: " + ie.getMessage());
		} catch (Exception et) {
			//retry again
			
			System.out.println("Exception occurred: " + et.getMessage());
		}finally {
			//This block is executed irrespective of exception thrown or not
			System.out.println("Delete Cookies");
		}
	}

}

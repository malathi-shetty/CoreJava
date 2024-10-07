package exceptions_demo_14;

public class Exceptions_MultiCatchExample {

	public static void main(String[] args) {
		//You can catch multiple exceptions in a single catch block.
		
		 try {
	            int[] numbers = {1, 2, 3};
	            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
	            String str = null;
	            System.out.println(str.length()); // NullPointerException
	        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
	            System.out.println("An exception occurred: " + e.getMessage());
	        }

	}

}

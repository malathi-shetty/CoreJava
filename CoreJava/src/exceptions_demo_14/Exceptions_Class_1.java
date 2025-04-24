package exceptions_demo_14;

public class Exceptions_Class_1 {

	public static void main(String[] args) {
		int b = 7;
		int c = 0;
		
		try {
			int k = b / c; // 7/0
				System.out.println(k);
		} catch (Exception e) {
			System.out.println("I catched the error exception");
		}

	}

}

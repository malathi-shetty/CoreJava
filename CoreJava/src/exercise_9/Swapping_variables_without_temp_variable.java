package exercise_9;

public class Swapping_variables_without_temp_variable {

	public static void main(String[] args) {

		int a = 4;
		int b = 5;

		a = a + b; // a = 9
		b = a - b; // b = 9 - 5 = 4
		a = a - b; // 5 = 9 - 4 = 5
		System.out.println("a: " + a);
		System.out.println("b: " + b);

	}

}

package exceptions_demo;

public class Exceptions_Class {

	int a = 4;

	int b = 7;
	int c = 0;

	int k = b / c; // 7/0

	public void getData() {
		System.out.println(k);
	}

	public static void main(String[] args) {

		Exceptions_Class ec = new Exceptions_Class();
		ec.getData();

	}

}

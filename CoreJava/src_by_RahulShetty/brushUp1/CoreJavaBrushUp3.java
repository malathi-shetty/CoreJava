package brushUp1;

public class CoreJavaBrushUp3 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 122 };

		// check if array has multiple of 2 i.e 2,4,6,8,10,122

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			} else {
				System.out.println(a[i] + " is not multiple of 2");
			}
		}
	}
}
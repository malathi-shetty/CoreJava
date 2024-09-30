package array_9;

public class Sortarraydemo {

	public static void main(String[] args) {

		int a[] = { 2, 6, 1, 4, 9 };
		int temp; // 1,2,3,4,6, 9
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) { // j=i+1 means i is getting compared with the next number
				if (a[i] > a[j]) {
					//swap
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < 5; i++) { // retrieve all the array values
			System.out.println(a[i]);
		}
		

	}

}

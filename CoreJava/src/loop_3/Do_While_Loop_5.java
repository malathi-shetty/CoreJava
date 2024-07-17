package loop_3;

public class Do_While_Loop_5 {
	
	public static void main(String[] args) {
	int j = 20;
	
	do{
		System.out.println(j);
		j++; // do the action for 1 loop_3 - first excutes for first loop_3 without checking expression
		System.out.println("after increment:" + j);
	}while(j<30); // then evaluates to run for other loops
	
	System.out.println("*********");
	
	int k = 20;
	do{
		System.out.println(k);
		k++; // do the action for 1 loop_3 - first excutes for first loop_3 without checking expression
		System.out.println("after increment:" + k);
	}while(k>30); // terminates since it is not true.

}
}
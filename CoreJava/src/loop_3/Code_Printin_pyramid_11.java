package loop_3;

public class Code_Printin_pyramid_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// 8 10 
				// 12 14 16 
				// 18 20 22 24
				
				// Starting number for the pattern
        		int k = 8;
        		
        		// Number of rows in the pattern
                int rows = 3;
        		
				for(int i=1; i<=rows; i++)
				{
					// Print numbers in each row
					for(int j=0; j<=i; j++) 
					{
					System.out.print(k + " ");
					System.out.print("\t");
						k=k+2; // Move to the next even number
					}
				 // Move to the next line after each row
					System.out.println("");
				}
				


	}

}

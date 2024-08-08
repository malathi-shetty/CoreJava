package try_Catch_Finally_Block;

public class Try_Catch_Finally_Block_8 {

	public static void main(String[] args) {
		
		// Child to Parent is allowed but Parent to child is NOt Allowed
		
		System.out.println(10/0);
		try
		{
			String s = "java";
			System.out.println(s.charAt(20));
		}catch(Exception e)
		{
			System.out.println("Parent catch");
		}catch(ArithmeticException ae)
		{
			System.exit(-2); 
		}finally
		{
			System.out.println("finally");
			System.out.println(10/0);
		}
	}
}
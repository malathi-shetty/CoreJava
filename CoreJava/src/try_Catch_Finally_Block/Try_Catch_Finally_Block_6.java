package try_Catch_Finally_Block;

public class Try_Catch_Finally_Block_6 {

	public static void main(String[] args) {
		try
		{
			String s = "java";
			System.out.println(s.charAt(20));
		}catch(ArithmeticException ae)
		{
			System.exit(-2); 
		}catch(Exception e)
		{
			System.out.println("catch");		
		}finally
		{
			System.out.println("finally");
			System.out.println(10/0);
		}
	}
}
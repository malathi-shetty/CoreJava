package try_Catch_Finally_Block;

public class Try_Catch_Finally_Block_10 {

	public static void main(String[] args) {
		
		try
		{
			String s = "java";
			System.out.println(s.charAt(20));
			System.out.println(10/0);
		}catch(Exception e)
		{
			System.out.println(10/0);
			System.out.println("Exception Child catch");
		}catch(Throwable t)
		{
			System.out.println(10/0);
			System.out.println("Throwable Parent catch");
		}finally
		{
			System.out.println("finally");			
		}
	}
}
package try_Catch_Finally_Block;

public class Try_Catch_Finally_Block_1 {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}catch(ArithmeticException ae)
		{
			System.exit(-2); // saying JVM to stop forcefully
		}catch(Exception e)
		{
			System.out.println("catch");
		}finally
		{
			System.out.println("finally");
		}
	}
}
/* Output:  
**System.exit() Call**: Inside this `catch` block, the `System.exit(-2);` method is called. 
This method terminates the Java Virtual Machine (JVM) with the specified status code. 
When `System.exit()` is called, it stops the JVM immediately and does not proceed to execute any further code.

Since `System.exit(-2);` is called before the `finally` block can be executed, there is no output at all. 
The JVM shuts down before reaching the `finally` block, and as a result, 
neither "finally" nor any other output is produced.
*/
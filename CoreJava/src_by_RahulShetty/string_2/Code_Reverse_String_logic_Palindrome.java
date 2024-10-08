package string_2;

public class Code_Reverse_String_logic_Palindrome {

	public static void main(String[] args) {
		
		//print the string in reverse
		// palindrome: even if u do reverse string should be same - madam; naman - no difference in string
		
		String s = "madam"; //madam
	//	String s = "Malathi"; //ihtalam
		
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println("reverse string: " + rev);
		
		if(s.toLowerCase().equals(rev.toLowerCase())) 
		{
			System.out.println(s +  " is a Palindrome String.");
		}else
		{
			System.out.println(s +  " is not a Palindrome String.");
		}

	}

}

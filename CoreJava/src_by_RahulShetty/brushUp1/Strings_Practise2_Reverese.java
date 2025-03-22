package brushUp1;

public class Strings_Practise2_Reverese {

	public static void main(String[] args) {
		//print the string in reverse
		
		String s ="madam";
		String t="";
		for(int i=s.length()-1;i>=0; i--)
		{
			t = t + s.charAt(i);
			
		}
		System.out.print(t);
		
		   // Use .equals() to compare the string contents
		if (s.equals(t)) {
            System.out.print(" is a palindrome");
        } else {
            System.out.print(" is Not a palindrome");
        }
			
	}

}

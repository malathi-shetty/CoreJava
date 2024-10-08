package string_2;

public class StringClass_Methods_2 {

	public static void main(String[] args) {
		
		String a ="hello"; 
		System.out.println(a.charAt(1)); // h-0; e-1 -- output would be e	
		System.out.println(a.indexOf("l")); // h-0; e-1, l-2 -- output would be l
		
		System.out.println("*******");
		
		String b =" javatraining ";
		//j-0,a-1,v-2,a-3,t-4,r-5,a-6,i-7,n-8,i-9, n-10, g-10 		
		System.out.println(b.charAt(2));
		System.out.println(b.indexOf("e"));
		System.out.println(b.substring(3, 7)); 
		//-- output would be atra (would print from starting index count (3 where index letter starts) & end with 7-1=6)
		System.out.println(b.substring(5)); // restricts ending index since no end index so it will print till last
		System.out.println(b.concat(" rahul teaches")); // concat & print javatrainingrahul teaches 
		System.out.println(b.length()); // along with space in front & back of the text it wud print - 14
		System.out.println(b.trim()); // space in front & back of the text javatraining would be removed
		System.out.println(b.toUpperCase());
		System.out.println(b.toLowerCase());
		
		System.out.println("*******");
		
		String c =" javatraining ";
		//split - based on delimeter
		String arr[]= c.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		//replace t with s
		System.out.println(c.replace("t", "s"));
	}

}

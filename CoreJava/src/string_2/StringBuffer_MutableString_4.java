package string_2;

public class StringBuffer_MutableString_4 {

	public static void main(String[] args) {
		// to work on original content by modifying the String
		// we use StringBuffer And StringBuilder - these both are mutable i.e they can be altered
		// both are same methods only difference is synchronization
		// StringBuffer is Thread safe but StringBuilder is not Thread safe
		
	// thread safe means when multiple methods/program are trying to access the StringBuffer class at a time
		
		// StringBuffer wont allow to act them at a time bcoz that will lead to false results. & make sure its is thread safe
		// means it will allow another method to access only when existing method is completed
		// serving 1 test & giving control to another test once previous test is completed like multiple testcase have acess to single variable
		// manage thread control & thread safe & synchronized & slow compared to StringBuilder
		// framework support parrallel execution then it is safe to use StringBuffer 
		
		// StringBuilder is not thread safe. it is non synchronized
		// means it allows multiple methods/program to do modification at a time
		// u may not get  correct results, as it is not thread safe it is faster than StringBuffer
		
		// StringBuffer
		StringBuffer sb = new StringBuffer("Hello"); 
		//H-0,e-1,l-2,l-3,o-4
		sb.append(" World");
		System.out.println(sb); // modify the existing value
		
		sb.insert(2, " She");
		System.out.println(sb); // He Shello World
		//H-0,e-1, s-2 , h-3, e -4,l-5,l-6,o-7, W-8,o-9,r-10,l-11,d-12
		sb.replace(6, 8, "aa"); // 7 is border it wont change 7-1=6 would be replaced -- He Sheaao World
		System.out.println(sb);
		
		sb.deleteCharAt(3);
		System.out.println(sb); // He heaao World
		
		sb.reverse();
		System.out.println(sb); //dlroW oaaeh eH

	}

}

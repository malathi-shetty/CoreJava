package streams_LambdaExpressions;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		// count the number of names starting with Alphabet A in list
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Aisha");
		names.add("Diana");
		names.add("Abhijeet");
		names.add("Alekhya");
		names.add("Rama");
		names.add("Adam");
		names.add("Rudransh");
		names.add("Arnav");
		names.add("Hridyansh");
		
		int count=0;
		
		for(int i=0; i<names.size(); i++)
		{
			String actual = names.get(i);// get element is to pull the elements whatever is in the list
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println("Count of Names Startinh with Letter 'A': " + count);
		
	}

}

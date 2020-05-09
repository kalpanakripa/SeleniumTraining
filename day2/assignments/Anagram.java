package week1.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String input1 = "stops";
		
		String input2 = "potss";
		
		
		if (input1.length()==input2.length()) 
		{
			
			char[] charArray1 = input1.toCharArray();
			
			char[] charArray2 = input2.toCharArray();
			
			Arrays.sort(charArray1);
			
			Arrays.sort(charArray2);
			
			boolean status = Arrays.equals(charArray1, charArray2);
			
			if (status) {
				System.out.println(input1+" and "+input2+" are anagrams");
				
			} else {
				System.out.println(input1+" and "+input2+" are not anagrams");
			}
			
		}
		else
		System.out.println(input1+" and "+input2+"are not in same length");
		
	}

}

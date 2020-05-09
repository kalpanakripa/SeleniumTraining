package week1.day2.assignments;

public class ChangeOddIndexToUpperCase 
{

	public static void main(String[] args) 
	{
		
		String input ="changeme";
		
		//Pseudo code 1: Using charArray 
		
		// convert string to char array
		 char[] charArray = input.toCharArray();
		  
		 for (int i = 0; i < charArray.length; i++) 
		 { 
			 if (i%2==1) {
				 System.out.print(Character.toUpperCase(charArray[i])); 
			 }
			 else
			System.out.print(charArray[i]);
		 }
		 
		
		/*
		 * //Pseudo code 2: int strLength = input.length();
		 * 
		 * for (int i = 0; i < strLength; i++) { char charAt = input.charAt(i);
		 * if(i%2==1) { System.out.print(Character.toUpperCase(charAt)); } }
		 */ 
		
	}

}

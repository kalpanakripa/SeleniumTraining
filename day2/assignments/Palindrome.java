package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		
		String inputString = "madam";
		
		String reverseString = "";
		
		int length = inputString.length();
		
		for (int i = length-1; i >=0; i--) {
			
			char eachChar= inputString.charAt(i);
			
			reverseString=reverseString+eachChar;
		}
			
			System.out.println("Reverse of given string is:"+reverseString);
			
			if (inputString.equalsIgnoreCase(reverseString))
			{
				System.out.println("Given input "+inputString+" is a Palindrome");
			}
			else
			{
				System.out.println("Given input "+inputString+" is not a Palindrome");
			}			

	}

}

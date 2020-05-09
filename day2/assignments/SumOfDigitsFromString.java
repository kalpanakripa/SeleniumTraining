package week1.day2.assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		
		String input = "Tes12Le79af65825";
		
		int sum = 0;
		
		String replaceString = input.replaceAll("[^0-9]","");
		
		
		char[] charArray = replaceString.toCharArray();
		
		for (char eachChar : charArray) {
			
			System.out.println(eachChar);
			
			int numericValue = Character.getNumericValue(eachChar);
			
			sum = sum + numericValue;

		}
		
		System.out.println("Sum of digits from given string "+input+" is "+sum);
	}

}

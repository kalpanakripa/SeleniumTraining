package week1.day2;

public class ReverseString {

	public static void main(String[] args) {

		String test = "kalpana vasudevan";

		// pseudo code 1:
		char[] charArray = test.toCharArray();

		int arrLength = charArray.length;

		for (int i = arrLength - 1; i >= 0; i--) {
			System.out.print(charArray[i]);

		}

		
		/* pseudo code2:
		 * int strLength = test.length(); for (int i = strLength-1; i>=0; i--) {
		 * System.out.print(test.charAt(i)); }
		 */
		 
	}
}

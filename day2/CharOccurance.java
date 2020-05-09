package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str= "welcome to chennai";
		int count = 0;
		
		char[] charArray = str.toCharArray();
		
		int arrLength=charArray.length;
		
		for (int i = 0; i < arrLength; i++) {
			if (charArray[i]=='e') {
				count = count + 1;
			}
		}
		System.out.println(count);
	}

}

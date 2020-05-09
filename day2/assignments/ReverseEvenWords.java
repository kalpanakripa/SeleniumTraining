package week1.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String input = "I am a software tester";
		
		String revWord=" ";
		
		String output=" ";
		
		String[] array = input.split(" ");
		
		for (int i = 0; i < array.length; i++) {
			
			String words = array[i];
			
			System.out.println(words);
			
			if (i%2!=0) {
				
				for (int j = words.length()-1; j >=0; j--) {
					
					revWord=revWord+words.charAt(j);
				}
				output=output+revWord+" ";
				
				revWord = " ";
			}
			else
			output=output+array[i]+" ";
		}
		
		System.out.println("After reversing even words: "+output);
	}

}
package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $ ";
		
		int letter = 0;
		int space = 0;
		int num = 0;
		int specialChar = 0;
		
		
		char[] charArray = test.toCharArray();
		
		for (char eachchar : charArray) {
			System.out.println(eachchar);
			
			
			if (Character.isLetter(eachchar)) { 
				letter = letter+1;
			}
			
			else if (Character.isDigit(eachchar)) { 
				num = num +1;
			}
			
			else if (Character.isSpaceChar(eachchar)) { 
				space = space+1; 
			}	
		    else {  
		    	specialChar= specialChar+1;
		    }
			
		}
		System.out.println("Number of letters available is: "+letter);
		System.out.println("Number of Digits available is: "+num);
		System.out.println("NUmber of Space available is: "+space);
		System.out.println("Number of special character available is: "+specialChar);
		
	}

}

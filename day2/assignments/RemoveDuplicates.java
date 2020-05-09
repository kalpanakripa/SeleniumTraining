package week1.day2.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String input = "We learn java basics as part of java sessions in java week1 learn";
		
		int count = 1 ;
		
		String[] array = input.split(" ");
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i+1; j < array.length; j++) {
				
				if (array[i].equals(array[j])) 
				{
						count = count +1;
						
						if (count>1) 
						{
						array[j]= " ";
						}
				}
					
			}
			
			System.out.println(array[i]);
			
		}
		
	}

}

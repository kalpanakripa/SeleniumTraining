package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr= {14,12,13,11,15,12,1,14,18,16,17,13,20,19,18,17,20,1};
		
		int arrlength= arr.length; //length of array
		
		int count;
		
		System.out.println("Duplicates in given array elements:");
		
		for (int i = 0; i < arrlength-1; i++) {
			count = 0;
			
			for (int j = i+1; j < arrlength; j++) 
			{
				if (arr[i]==arr[j]) 
				{
					count=count+1;					
				}			
			}
			
			if (count>0) {
				System.out.println(arr[i]);
			}
			
		}		
		
	}

}

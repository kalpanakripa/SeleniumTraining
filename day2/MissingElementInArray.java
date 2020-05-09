package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,5,8,9};
		int start = arr[0];
		int end = arr[arr.length-1];
		boolean isMissing=false;
		
		
		Arrays.sort(arr); //sort array elements
		
		System.out.println("Sorted Array elements are:"+Arrays.toString(arr));
		
		for (int i = start; i < end; i++) {
			
			for (int j = 0; j < arr.length-1; j++) {
				
				if (i==arr[j]) {
					isMissing=false;
					break;
					
				} else {
					isMissing=true;
				}
			}
			if (isMissing) {
				System.out.println(i);
			}
		}
	}

}

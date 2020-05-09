package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = {9,5,7,4,2,1,20,17,30,11,3,50 };

		Arrays.sort(data); //arrange array in ascending order

		System.out.println("Sorted array is:" + Arrays.toString(data));
		
		int arrLength = data.length;
		
		System.out.println("Second largest element in given array is: "+(data[arrLength-2]));

	}

}

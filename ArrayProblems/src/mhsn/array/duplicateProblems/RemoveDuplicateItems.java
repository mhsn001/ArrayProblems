package mhsn.array.duplicateProblems;

import mhsn.array.utils.ArrayUtils;

public class RemoveDuplicateItems {
	
	
	/*Given array is sorted. remove the duplicate in time complexity O(n)*/
	public static void removeDuplicatesFromSortedArray(int[] arr){
		ArrayUtils.printArray(arr);
		int j=0;
		//Loop will run till second last element of the array 
		for(int i=0; i<arr.length -1; i++){
			
			if(arr[i] != arr[i+1]){
				//if not equals then keep ith value on jth position and increase j by one
				arr[j] = arr[i];
				j++;
			}
		}
		arr[j] = arr[arr.length -1]; //because loop will not reach to the last element so directly assigning the last element in last jth position
		ArrayUtils.printArray(arr);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Removing duplicates from Sorted array");
		removeDuplicatesFromSortedArray(new int[]{1,1,1,1,1,1,1,2,2,2,3});
				
	}
	
	
}

package mhsn.array.duplicateProblems;

import mhsn.array.utils.ArrayUtils;

/* You have to find out duplicate elements but there are some constraint here :
 * 1. Elements in the array should be in the range of 1 to n where n is length of array
 * 2. this algorithm will take O(n) time complexity and O(1) space complexity 
 * 
 * Example: 
 * 		Input : 3, 3, 2, 1, 9, 8, 1, 2, 3, 9
 * 		
 * 		Output: 
 * 				 3
 *				 1
 *				 2
 *				 9 
 * 
 * */


public class FindDuplicateIems {

	
	private static void findDuplicatesWithinARange(int[] arr) {
		
		ArrayUtils.printArray(arr);
		int length = arr.length;
		for(int i = 0; i < arr.length; i++){
			int item = Math.abs(arr[i]); // getting the absolute value of item.
			if(item > length){ // if item is greater than length of the array then getting the actual value of item by deducting the length.
				item = item - length;
			}
			//if the value is less than 0 that means this value has already been visited once. So its a duplicate, print it.
			if(arr[item-1] < 0){
				System.out.println(" "+ item);	
				// below statement will mark it as this item is already printed or found so no need to print it again. 
				arr[item-1] = length + Math.abs(arr[item-1]); 
			}else if(arr[item-1] > 0 && arr[item-1] <=  length){ //visiting the element first time inverting it to mark it visited.
				arr[item-1] = -1 * arr[item-1];
			}
		}
				
	}
	
	public static void main(String[] args) {
		
		findDuplicatesWithinARange(new int[]{3, 3, 2, 1, 9, 8, 1, 2, 3, 9});
		
	}
	
	
}

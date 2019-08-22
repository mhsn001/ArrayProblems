package mhsn.array.maxDiff;

import mhsn.array.utils.ArrayUtils;

 /* An unsorted integer array is given which you have to find out max difference of two elements
  * 
  * say elements e1 - e2 produces max difference where indices of e1 and e2 are i1 and i2 respectively,
  * and i1 > i2.
  *
  * Example:
  * 	Input: 8, 1, 4, 3, 5
  * 
  * 	Output: Max difference : 4
  * 
  * */




public class MaxDifference {
		
	public static void maxDifferenceInArray(int[] arr){
		
		ArrayUtils.printArray(arr);
		int maxSoFar = 0;
		int currentMax = 0;
		
		for(int i =1; i<arr.length; i++){
			currentMax += (arr[i] - arr[i-1]);
			currentMax = Math.max(currentMax, 0);
			maxSoFar = Math.max(maxSoFar, currentMax);
			}
		
		System.out.println("Max difference : "+ maxSoFar);
		
	}
	
		
	public static void main(String[] args) {
		
		maxDifferenceInArray(new int[] {8,1,4,3,5});
	}
	
	
}

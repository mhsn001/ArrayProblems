package mhsn.array.maxSum;

import mhsn.array.utils.ArrayUtils;

public class MaxSumSubArray {

	/*An unsorted array with length n is given which contains items with range from Integer.MIN_VALUE to Integer.MAX_VALUE. 
	 *You have to find out a sub array whose sum of the elements is highest
	 *
	 *Example: 
	 *	Input: 
	 *		4, -3, -2, 2, 3, 1, -2, -3, 4, 2, -6, -3, 4, 2, -6, -3, -1, 3, 2, 1
	 *	
	 *	Output: 
	 *		Max sub array sum is : 7
	 *		Index Range is : 3 ==> 9
	 *		2 + 3 + 1 + -2 + -3 + 4 + 2 = 7
	 *
	 *To solve this problem we will implement Kaden's algorithm.
	 *
	 *
	 **/
	
	
	public static void maxSumSubArray(int[] arr){
		ArrayUtils.printArray(arr);
		
		int maxSumSoFar = arr[0];
		int latestSum = 0;
		int subArrayStart = 0;
		int subArrayEnd = 0;
		int tempStart = 0;
		for(int i=0; i<arr.length; i++){
			
			latestSum = latestSum + arr[i];
			
			if(latestSum > maxSumSoFar){
				subArrayStart = tempStart;
				subArrayEnd = i;
				maxSumSoFar = latestSum;
			}
			if(latestSum < 0){
				tempStart = i+1;
				latestSum = 0;
			}
		}
		
		System.out.println("Max sub array sum is : "+maxSumSoFar);
		System.out.println("Index Range is : "+subArrayStart +" ==> "+subArrayEnd);
		for(int i = subArrayStart; i<=subArrayEnd; i++){
			if(i != subArrayEnd){
				System.out.print(arr[i]+" + ");	
			}else{
				System.out.print(arr[i]+" = " + maxSumSoFar);	
			}
			
		}
	}
	
	public static void main(String[] args) {
		//Maximum sum sub array(Kadane's Algorithm)
		maxSumSubArray(new int[]{4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,4,2,-6,-3,-1,3,2,1});
		//maxSumSubArray(new int[]{-10,-3,-40, 2, -1});
	}
	
	
	
}

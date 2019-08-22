package mhsn.array.heighestItem;

import java.util.PriorityQueue;

import mhsn.array.utils.ArrayUtils;


/*An unsorted integer array is given. You have to find out the nth highest number in the array
 * 
 * Example: 
 * 		Input: 
 * 			input1 : 12,15,8,6,4,20,21,30,5,25,35  ==> Array
 * 			input2 : 3  ==> A number n
 * 	
 * 
 *		Output: 
 * 			Required item is 25
 * 		
 * 
 * To solve this problem we will use min heap. In java PriorityQueue is used as a heap. 
 * 
 * 
 * */



public class NthHighestItem {

public static void findNthHighestItem(int [] arr, int n){
		
		ArrayUtils.printArray(arr);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(n);
		
		for(int i =0; i< arr.length; i++){
			if(i<n){
				pq.offer(arr[i]);
			}else{
				if(pq.element() < arr[i]){
					pq.poll();
					pq.offer(arr[i]);
				}
			}
		}
		
		System.out.println("Required item is "+pq.poll());
		
	}
	
	public static void main(String[] args) {
		int[] arr =new int[] {12,15,8,6,4,20,21,30,5,25,35};
		findNthHighestItem(arr, 3);
	}
	
}

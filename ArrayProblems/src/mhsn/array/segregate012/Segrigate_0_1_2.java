package mhsn.array.segregate012;

import mhsn.array.utils.ArrayUtils;




/*You have been given an array of length n which contains only 0's, 1's and 2's
 * segregate these number in such a way that all 0's come first then all 1's and then all 2's 
 * 
 * Example: 
 *  Input : 1, 1, 2 ,0 , 0, 2, 1
 *  Output: 0, 0,, 1, 1, 1, 2, 2
 *  
 *  This problem is also known as dutch national flag proble.
 *  
 *  
 * */



public class Segrigate_0_1_2 {

	
	public static void segregate_0_1_2(int[] arr){
		ArrayUtils.printArray(arr);
		int low = 0;
		int high = arr.length -1;
		int counter =0; 
		int temp;
		while(counter <= high){
			switch(arr[counter]){
			case 0: // if arr[counter] == 0 then replace it with lower index and increase low and counter 
				temp = arr[low];
				arr[low] = arr[counter];
				arr[counter] = temp;
				low++;
				counter++;
				break;
			
			case 1:  // if arr[counter] == 1 then just increase the counter
				counter++;
				break;
				
			case 2:  // if arr[counter] == e then replace the value with higher index and decrease high 
				temp = arr[high];
				arr[high] = arr[counter];
				arr[counter] = temp;
				high--;
				break;
			
			}
		}
				
		ArrayUtils.printArray(arr);		
		
	}
		
	public static void main(String[] args) {
		//Dutch National Flag problem
		segregate_0_1_2(new int[]{0,1,2,0,1,2,0,1,2,0,1,2});
	}
	
	
}

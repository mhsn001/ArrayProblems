package mhsn.array.segregate012;

import mhsn.array.utils.ArrayUtils;

/*You have been given an array of length n which contains 0, and non zero numbers
 * segregate these number in such a way that all 0's shifted in the edn of the array.
 * 
 * Example: 
 *  Input : 0, 0, 1, 2, 0, 3, 0, 0, 4
 *  Output: 1, 2, 3, 4, 0, 0, 0, 0, 0
 *  
 * */
public class Segrigate0{
	
	private static void segrigate0(int[] arr){
		ArrayUtils.printArray(arr);
		int temp = -1;
		
		for(int i =0; i < arr.length; i++){
			
			if(temp < 0 && arr[i] == 0){
				temp = i;
			}
			
			if(arr[i] != 0 ){
				
				if(temp != -1){
					int t = arr[i];
					arr[i] = arr[temp];
					arr[temp] = t;
					temp++;
				}
				
			}
			
		}
		ArrayUtils.printArray(arr);	
	}
	
	public static void main(String[] args) {
		
		segrigate0(new int[]{0, 0, 1, 2, 0, 3, 0, 0, 4});
	}
	
	
	
}

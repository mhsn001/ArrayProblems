package mhsn.array.highestItem;

import mhsn.array.utils.ArrayUtils;

public class SecondHighestItem {


	private static void findScondHighestItem(int[] arr) {
		// TODO Auto-generated method stub
		
		if(arr == null || arr.length<2 )
		{
			throw new IllegalArgumentException("****** Not a Valid Argument ******");
		}
		
		int lasthigh =Integer.MIN_VALUE;
		int currentHeigh = arr[0];
		
		for(int i=1; i < arr.length; i++){
			
			if(currentHeigh < arr[i]){
				lasthigh = currentHeigh;
				currentHeigh = arr[i];
			}else if(lasthigh < arr[i]){
				lasthigh = arr[i];
			}
		}
		System.out.println("\nSecond Highest is : "+lasthigh);
		//System.out.println("Highest is : "+currentHeigh);
		
	}
	
	
	public static void main(String[] args) {
		int[] arr =new int[] {12,10,8,6,4};
		 ArrayUtils.printArray(arr);
		 findScondHighestItem(arr);
	}
	
	
}

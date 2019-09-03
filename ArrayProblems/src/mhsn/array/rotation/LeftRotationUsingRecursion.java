package mhsn.array.rotation;

import mhsn.array.utils.ArrayUtils;


/*
 * An array of unsorted integer is given you have to rotate array by n. 
 * 
 * Example: 
 * 	
 * 	Input : 
 *			1, 2, 3, 4, 5, 6, 7, 8  ==> an array
 *			3 ==> number of rotations
 *  
 *  Output: 
 *  		4, 5, 6, 7, 8, 1, 2, 3
 *  
 *  
 *  
 *  */

public class LeftRotationUsingRecursion {

	private static void leftRotation(int[] a, int r){
		ArrayUtils.printArray(a);
		leftRotateRecursion(a, r, 0);
		ArrayUtils.printArray(a);
	}
	
	private static  void leftRotateRecursion(int[] a, int r, int index){	
		if(r == index){
			for(int i=r; i< a.length; i++){
				a[i-r] = a[i];
			}
			return;
		}
		int t = a[index];
		leftRotateRecursion(a, r, index +1);
		a[a.length - r+ index] = t;
	}
	
	public static void main(String[] args) {
		leftRotation(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 3);
	}
	
}

package mhsn.array.findABC;

import java.util.HashMap;
import java.util.Map;

/*An unsorted array is given. You have to find elements a, b and c which satisfy the equation a + b = c 
 * 
 * Example: 
 * 		Input: 4, 2, 15, 25, 10, 12, 3, 2
 * 
 * 		Output: 
 * 			a : 2  b : 10   c : 12
 *			a : 2  b : 2   c : 4
 *			a : 15  b : 10   c : 25
 *			a : 10  b : 2   c : 12
 *			a : 12  b : 3   c : 15
 * 			
 * 
 * */


public class ABCFinder {

		private static void findABC(int[] arr) {
			Map<Integer, Integer> m = new HashMap<Integer, Integer>();
			//keep all the elements in the HashMap.
			for(int e: arr){
				m.put(e, e);
			}
					
			for(int i=0; i<arr.length; i++){
				for(int j=i+1; j<arr.length; j++){
				int temp = arr[i] +arr[j];
					if(m.containsKey(temp)){
					System.out.println("a : "+arr[i]+"  b : "+arr[j]+"   c : "+temp);
				}	
				}
			}
					
		}
	
		public static void main(String[] args) {
			findABC(new int[]{4, 2, 15, 25, 10, 12, 3, 2});
		}
	
	
	
}

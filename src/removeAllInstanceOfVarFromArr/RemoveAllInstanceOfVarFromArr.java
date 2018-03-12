package removeAllInstanceOfVarFromArr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 
 * 
 * Remove Element

Given an array and a value, remove all the instances of that value in the array. 
Also return the number of elements left in the array after the operation.
It does not matter what is left beyond the expected length.

Example:
If array A is [4, 1, 1, 2, 1, 3]
and value elem is 1, 
then new length is 3, and A is now [4, 2, 3]
Try to do it in less than linear additional space complexity.


 * @author vyasma1
 *
 */
public class RemoveAllInstanceOfVarFromArr {


	public static void main(String args[]){
		
		List<Integer> arr =  new ArrayList<>(Arrays.asList(4, 1, 1, 2, 1, 3));
		
		System.out.println(removeElement(arr,1));
	}
	public static int removeElement(List<Integer> a, int b){
//	    a.removeAll(Collections.singleton(b));
//	    return a.size();	
		Iterator<Integer> it = a.iterator();
		
		while(it.hasNext()){
			int val = it.next();
			
			if(val == b){
				it.remove();
			}
		}
		return a.size();
//		
	}
	
	
	public int removeElement(int[] nums, int val) {
	    int i = 0;
	    int n = nums.length;
	    while (i < n) {
	        if (nums[i] == val) {
	            nums[i] = nums[n - 1];
	            // reduce array size by one
	            n--;
	        } else {
	            i++;
	        }
	    }
	    return n;
	}
}

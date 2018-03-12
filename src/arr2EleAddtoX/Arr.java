package arr2EleAddtoX;
/**
 *  You have an array of n elements, and a sum. Check if any 2 
 *  elements in the array sum to the given sum.
Expected time complexity O(n).
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

public class Arr {

	public static void main(String args[]){
		
		List<Integer> arr = Arrays.asList();
		
		System.out.println(findK(arr,37));
	}
	
	public static boolean findK(final List<Integer> arr,int k){

		Collections.sort(arr);
		
		for(int a: arr){
			System.out.print(a+", ");
		}
		
		int i = 0,j = arr.size() -1;
		
		while(i<j){
			if(arr.get(i)+arr.get(j)==k){
				return true;
			}else if( arr.get(i)+arr.get(j) > k){
				j--;
			}else{
				i++;
			}
		}
		return false;
	}
}

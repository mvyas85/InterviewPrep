package FBFinB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/*
 * Given -5,4,7 find if any two number in array sum up to target value
 */
public class FindSumInEquation {
	

	public static void main(String args[]){
		ArrayList<Integer> sum = new ArrayList<Integer>();
//		List<Integer> arr = Arrays.asList(38,78,77,59,38,33,79,38,24,39,29,93,15,9,63,13,63,75,39,81,91,13,34,24,12,59,19,64,20,36,71,82,26,56,94,36,91,7,78);
		List<Integer> arr = Arrays.asList(1,3,4,40,50,52);
				
		sum.add(3);

		sum.add(7);

		sum.add(4);
		
		System.out.println(getSum2(arr, 51));
		
	}
	

	public static boolean getSum3(List<Integer> arr, int target){
	
		HashSet<Integer> set = new HashSet<>();
		
		for(int i =0 ;i <arr.size();i++){
			if(set.contains(target)){return true;}
			set.add(target-arr.get(i));
		}
		return false;
		
	}
	
	// o(n^2) solution not good performance wise
	public static boolean getSum(List<Integer> arr, int target){
	int len = arr.size();
		for(int i =0;i<len-1;i++){
			for(int j = i+1;j<len;j++){
				if((arr.get(i) + arr.get(j))== target){
					return true;
				}
			}
		}
		return false;
	}

	
	//o(n) solution
	
	public static boolean getSum2(List<Integer> arr, int target){
		Collections.sort(arr);
		
		int l = 0;
		int r = arr.size() - 1;
		
		while (l<r){
			if(arr.get(l)+arr.get(r) == target){return true;}
			else if (arr.get(l)+arr.get(r) > target) {
				r --;
				}
			else l++;
		}
		return false;
	}
	public static boolean getSum1(ArrayList<Integer> arr, int target){
		Collections.sort(arr);
		
		boolean result = false;
		int len = arr.size();
			for(int i =0;i<len-1;i++){
				int a = arr.get(i) ;
				
				int b =  target - a;
				System.out.println("b = "+b);
				result = binarySearch(arr,b);
				if(result){
					return result;
				}
			}
			return false;
	}
	private static boolean binarySearch(ArrayList<Integer> arr,int b) {
		
		int len = arr.size();
		
		int low = 0;
		int high = len-1;
		while(high >= low){
			int middle  = (low + high) /2;
			if(arr.get(middle) == b)
				return true;
			else if(b < arr.get(middle)){
				high = middle-1;
			}
			else if(b > arr.get(middle)){
				low = middle +1;
			}
			
		}
		return false;
	}
}

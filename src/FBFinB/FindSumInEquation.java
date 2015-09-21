package FBFinB;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Given -5,4,7 find if any two number in array sum up to target value
 */
public class FindSumInEquation {
	

	public static void main(String args[]){
		ArrayList<Integer> sum = new ArrayList<Integer>();
		
		sum.add(-5);

		sum.add(4);

		sum.add(7);
		
		System.out.println(getSum1(sum, -2));
		
	}
	public static boolean getSum(ArrayList<Integer> arr, int target){
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

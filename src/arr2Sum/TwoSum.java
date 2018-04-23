package arr2Sum;

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 * @author vyasma1
 *
 */
public class TwoSum {


	public static void main(String args[]){
//		System.out.println(numSum(3,2));
		int[] arr = {2, 7, 11, 15};
		int[] ans = twoSum2(arr,9);
		
		System.out.println(ans[0]);
		System.out.println(ans[1]);
	}

	
	//What if array is not sorted ?
	public static int[] twoSum2(int[] arr,int target){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

		int[] ans = new int[2];
		
		for(int i=0;i<arr.length;i++){
			map.put(target-arr[i], i);
		}
		
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				ans[0]=map.get(arr[i]);
				ans[1]=i;
				break;
			}
		}
		return ans;
	}
	
	
	
	//If assumed Array is sorted !!
	public static int[] twoSum(int[] arr,int target){
		int[] ans = new int[2];
		
		int left = 0;
		int right = arr.length-1;
		
		while(left<right){
			if(arr[left]+arr[right]== target){
				ans[0]=left;
				ans[1]=right;
				break;
			}else if(arr[left]+arr[right]<target){
				left++;
			}else{
				right--;
			}
			
		}

		return ans;
	}
}

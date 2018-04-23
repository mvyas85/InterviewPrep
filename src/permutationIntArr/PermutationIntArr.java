package permutationIntArr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * 
 * 
 * 46. Permutations  // WITHOUT DUPLICATE


Given a collection of distinct numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]



 * @author vyasma1
 *
 */
public class PermutationIntArr {

	public static void main(String args[]){
		int[] arr = new int[]{1,2,3};
		
		List<List<Integer>> list = permute(arr);
		
		System.out.println(list);
	}

    public static List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	Arrays.sort(nums);
    	helper(list,new ArrayList<Integer>(),nums,new boolean[nums.length]);
    	return list;
    	
	}
	private static void helper(List<List<Integer>> list, List<Integer> temp, int[] nums,boolean[] used){
		if(temp.size() == nums.length){
			list.add(new ArrayList<Integer>(temp));
		}else{
			for(int i=0;i<nums.length;i++){
//				if(temp.contains(nums[i])){continue;}
				if(used [i] || (i > 0 && nums[i-1] == nums[i] && !used [i-1] )){continue;}
				temp.add(nums[i]);
				used[i] = true;
				helper(list,temp,nums,used);
				used[i] = false;
				temp.remove(temp.size()-1);
			}
		}
	}
	private static void permutation(int[] arr, int start, int end) {

		if(start == end){
			System.out.println(Arrays.toString(arr));
		}
		
		for(int i = start;i<=end;i++){
			swap(arr,start,i);
			permutation(arr,start+1,end);
			swap(arr,start,i);
		}
		
	}

	private static void swap(int[] arr, int a, int b) {

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
}

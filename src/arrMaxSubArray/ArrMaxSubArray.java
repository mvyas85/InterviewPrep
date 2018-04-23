package arrMaxSubArray;

/**
 * 53. Maximum Subarray
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.

 * @author vyasma1
 *
 */


/*
 
int sum = nums[0], max = nums[0];

for(int i =0;i<nums.length;i++){

	if(sum<0){
		sum =0;
	}
	sum = sum + nums[i];
	max = Math.max(sum,max);
}
*/


public class ArrMaxSubArray {

	public static void main(String args[]){
		System.out.println(maxSubArray(new int[]{1, -1, -2,2, -1}));
	}
	
	public static int maxSubArray(int[] arr){
		int max = arr[0];
		int sum = arr[0];
		
		for(int i=1;i<arr.length;i++){
			sum = arr[i] + ((sum<0)? 0 : sum);
			max = Math.max(sum, max);
			
		}
		
		return max;
	}

}

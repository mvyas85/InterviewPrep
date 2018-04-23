package arrProductExceptItSelf;

/**
 * 238. Product of Array Except Self

Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal 
to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

Follow up:
Could you solve it with constant space complexity? (Note: The output array does not count as extra space 
for the purpose of space complexity analysis.)
 * 
 *
 */


public class ArrProductExceptItSelf {
	
	public static void main(String args[]){
		productExceptSelf(new int[]{1,2,3,4});
	}
	public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        res[0] = 1;
        for(int i=1; i < nums.length; i++) {
            res[i] = res[i-1] * nums[i-1];
        }
        for(int j = nums.length - 1; j > 0; j--) {
            res[j] *= res[0];
            res[0] *= nums[j];
        }
        return res;
    }

}

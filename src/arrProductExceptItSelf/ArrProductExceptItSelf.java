package arrProductExceptItSelf;
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

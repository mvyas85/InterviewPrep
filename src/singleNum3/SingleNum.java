package singleNum3;

import java.util.Arrays;

public class SingleNum {

	
	public static void main(String args[]){
		int[] nums = {2,2,3,2};
		
		System.out.println(hammingWeight(11));
	}
	
    public static int hammingWeight(int n) {
        int total = 0;
     	int num = n;
        for(int i =0;i<32;i++){
            total = total + (num ^ 0);
             num = n>>1;
        }
        return total;
        
    }
	
    public static int singleNumber(int[] nums) {
    	int len = nums.length;
        if(len== 1){
            return nums[0];
        }
        int answer =0;
        
        Arrays.sort(nums);
        
        int i = 0;
        while (i<len-2){
            if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2]){
                i = i+3;
            }else{
                answer = nums[i];
                i++;
            }
        }
        if(i==len-1){
            answer = nums[len-1];
        }
        return answer;
    }
}

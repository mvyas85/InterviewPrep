package removeDupSortedArr;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDupFromSortedArr {

	public static void main(String args[]){
		int num[] = {1,1};
		removeDuplicates(num);
	}
    public static int removeDuplicates(int[] nums) {
        
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        int len = nums.length-1;

//        ArrayList<Integer> al = new ArrayList<Integer>(){{add(rightIndex);add(leftIndex);add(topIndex);add(bototmIndex);}} ;
        
        for(int i=0,j=i+1;j<len;){
            if(nums[i]==nums[j]){
                swap(nums,j,len);
                len--;
                i++;
                j = i+1;
            }else{
                j++;
            }
        }
        
        Arrays.sort(nums,0,len);
        
        return len;
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

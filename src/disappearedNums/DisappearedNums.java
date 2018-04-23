package disappearedNums;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DisappearedNums {

	public static void main(String args[]) {
		int[] num = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(num));
	}
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++){
            int idx = Math.abs(nums[i])-1;
            System.out.println("nums["+i+"]= "+nums[i]+"\tidx="+idx);
            if(nums[idx]>0){
                nums[idx] = -nums[idx];
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] >0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}

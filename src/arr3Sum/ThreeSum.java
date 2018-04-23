package arr3Sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

    		int[] num = {3,0,-2,-1,1,2};
    		
    		 String out = int2dListToString(threeSum(num));
             
             System.out.print(out);
    }
    
    public static List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i != j){
                    int sum = nums[i]+nums[j];
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(i);
                    temp.add(j);
                    map.put(sum,temp);
                }
            }
        }
        
        for(int i = 0;i<nums.length;i++){
            int comp = nums[i] * -1;
            if(map.containsKey(comp) ){
                 
                List<Integer> temp = map.get(comp);
                List<Integer> temp2 = new ArrayList<Integer>();
                if(temp.get(0) != i  && temp.get(1) !=i){
                    temp2.add(nums[temp.get(0)]);
                    temp2.add(nums[temp.get(1)]);
                    temp2.add(nums[i]);
                    Collections.sort(temp2);
                    if(!ans.contains(temp2)){
                        ans.add(temp2);
                    }
                }
            }
        }
        return ans;
    }
    
    public static String int2dListToString(List<List<Integer>> nums) {
        StringBuilder sb = new StringBuilder("[");
        for (List<Integer> list: nums) {
            sb.append(integerArrayListToString(list));
            sb.append(",");
        }
    
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
    
    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }

    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
}

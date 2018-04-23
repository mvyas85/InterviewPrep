package topKFrequentEle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TopKFrequentEle {

	public static void main(String args[]){
		int[] arr = {1,1,1,2,2,3};
	
		System.out.println(topKFrequent(arr,2));
	}
	
    public static List<Integer> topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                map.put(nums[i],++val);
            }else{
                map.put(nums[i],1);
            }
        }
        
        List list = sortedListByValue(map);
        List<Integer>  ans = new ArrayList<Integer> ();
        for(int i=0;i<k;i++){
            Map.Entry entry = (Map.Entry)list.get(i);
            ans.add((Integer) entry.getKey());
        }
        return ans;
        
    }
    
    private static List<Integer> sortedListByValue(HashMap map){
        List<Integer> list = new LinkedList<>(map.entrySet());
        
        Collections.sort(list,new Comparator() {

			@Override
			public int compare(Object e1, Object e2) {
                return ((Comparable)((Map.Entry)e2).getValue()).compareTo(((Map.Entry) e1).getValue());
            }
        });
        


        
        return list;
    }
    
}

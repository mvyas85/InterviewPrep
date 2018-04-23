package anagramGroups;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnagramGroups {
	public static void main(String args[]){
		String[] arr = {"eat","tea","tan","ate","nat","bat"};
		 List<List<String>> ans = groupAnagrams(arr);
	}
	
	
    public static List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<List<String>>();
        if(strs.length == 1){
            List<String> list = new ArrayList<String>();
            list.add(strs[0]);
            ans.add(list);
            return ans;
        }
        
        HashMap<String, HashMap<Character,Integer>> mainMap = new HashMap<String, HashMap<Character,Integer>>();
        
        for(int i=0;i<strs.length;i++){
            HashMap<Character,Integer> map = new HashMap<Character,Integer>();
            for(char c: strs[i].toCharArray()){
                int val = 0;
                if(map.containsKey(c)){
                    val = map.get(c);
                }
                map.put(c,++val);
            }
            mainMap.put(strs[i],map);
        }
        
        
        for(int i=0;i<strs.length;i++){
            
            if(strs[i].equals("#")){continue;}
            
            List<String> list = new ArrayList<String> ();
            list.add(strs[i]);

            HashMap<Character,Integer> map1 = mainMap.get(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                HashMap<Character,Integer> map2 = mainMap.get(strs[j]);
                
                if (map1.equals(map2)){
                    list.add(strs[j]);
                    strs[j]="#";
                }
            }
            ans.add(list);
        }
        return ans;
    }
}

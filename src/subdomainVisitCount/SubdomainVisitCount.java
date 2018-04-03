package subdomainVisitCount;

import java.util.*;
import java.util.Map.Entry;
public class SubdomainVisitCount {
	
	public static void main(String args[]){
		System.out.println(subdomainVisits(new String[]{"900 google.mail.com",
		                                                 "50 yahoo.com",
		                                                 "1 intel.mail.com",
		                                                 "5 wiki.org"}));
	}
    public static List<String> subdomainVisits(String[] cpdomains) {
        
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        for(String str : cpdomains){
            int spaceInd = str.indexOf( " ");
            String num =str.substring(0,spaceInd);
            int count = Integer.parseInt(num);
            
            str = str.substring(spaceInd+1,str.length());
            
            if(map.containsKey(str)){
            	int val = map.get(str);
                map.put(str,count+val);
            }else{
                map.put(str,count);
            }
            

            String s = str;
            
            while(s.indexOf(".") != -1){
                int ind = s.indexOf(".")+1;
                
                 s = s.substring(ind,s.length());
                
                if(map.containsKey(s)){
                	int val = map.get(s) + count;
                    map.put(s,val);
                }else{
                    map.put(s,count);
                }
            }
        }
        List<String> ans = new ArrayList<String>();
        
        
        for(Entry<String,Integer> e :  map.entrySet()){
            ans.add(e.getValue()+ " " + e.getKey());
        }
        
        return ans;
        
        
        
    }
}

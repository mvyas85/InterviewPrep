package longestSubStr;

import java.util.HashSet;

public class LongestSubStr {
	public static void main(String args[]){
		System.out.println(lengthOfLongestSubstring("       "));
	}
	
	
    public static int lengthOfLongestSubstring1(String s) {

        
        //         pwwkedqw
        //visited = no no yes no no no no yes
        //          ______
        //          ______
        
    boolean [] visited = new boolean[s.length()];
    HashSet<Character> set = new HashSet<>();
    for(int i=0;i<s.length();i++){
        if(!set.add(s.charAt(i))){
        	visited[i] = true;
        }
    }
    int len = 0;
    int maxLen = 0;
    int start =0;
    
    for(int currPos=0;currPos<s.length();currPos++){
        if(visited[currPos]){
            
            len=currPos-start;
            if(len>maxLen){
                maxLen = len;
            }
            
            start = currPos;
        }else{
        	len++;
        }
        
    }
     return Math.max(len, maxLen);   
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int[] visited = new int[26];
        int start = 0;
        for (int currPos = 0; currPos < s.length(); currPos++) {
        	if(visited[s.charAt(currPos)-'a'] > 0){
        		start = Math.max(start, visited[s.charAt(currPos)-'a']);
        	}
            visited[s.charAt(currPos)-'a'] = currPos + 1;
            maxLen = Math.max(maxLen, currPos - start + 1);
        }
        return maxLen;
    }
}

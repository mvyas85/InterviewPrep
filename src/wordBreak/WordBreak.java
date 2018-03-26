package wordBreak;

/**
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words. You may assume the dictionary does not contain duplicate words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".

UPDATE (2017/1/4):
The wordDict parameter had been changed to a list of strings (instead of a set of strings). Please reload the code definition to get the latest changes.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {

	public static void main(String args[]){
		List<String> list = new ArrayList<String>(Arrays.asList("leet","code"));
		System.out.println(wordBreak2("leetcodeleet",list));
	}

    public static boolean wordBreak2(String s, List<String> wordDict) {
    	   if (s == null && wordDict == null)
    	        return true;
    	    if (s == null || wordDict == null)
    	        return false;
    	    //dp[i] represents if s.substring(0, i) is wordbreakable.
    	    boolean[] dp = new boolean[s.length()+1];
    	    dp[0] = true;
    	    for (int i = 1; i <= s.length(); i++) {
    	        for (int j = 0; j < i; j++) {
    	        	String word1 = s.substring(j, i);
    	            if (dp[j] && wordDict.contains(word1)) {
    	                dp[i] = true;
    	                break;
    	            }
    	        }
    	    }
    	    return dp[s.length()];
    }
}

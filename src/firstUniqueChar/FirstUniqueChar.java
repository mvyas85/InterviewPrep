package firstUniqueChar;

//
//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
//
//Examples:
//
//s = "leetcode"
//return 0.
//
//s = "loveleetcode",
//return 2.
//Note: You may assume the string contain only lowercase letters.
//

public class FirstUniqueChar {
	public static void main(String args[]){
		System.out.println(firstUniqChar("leetcode"));
	}
	
    public static int firstUniqChar(String s) {

        int[] chs = new int[128];
        
        for(int i=0;i<s.length();i++){
            chs[s.charAt(i)-'a'] = chs[s.charAt(i)-'a'] +1;
        }
        
        for(int i=0;i<chs.length;i++){
            if(chs[i]==1){
                return i;
            }
        }
        return -1;
        
    }
}

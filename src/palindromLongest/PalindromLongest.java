package palindromLongest;
/**
 * 
 * 409. Longest Palindrome
 * 
Given a string which consists of lowercase or uppercase letters, find the length of the longest 
palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.



a b c d c a 
_
___

Checking -1 0 ---- 0 0
= 0 0
Checking -1 1 ---- 0 1
Checking  0 2 ---- 1 2
Checking  1 3 ---- 2 3
Checking  2 4 ---- 3 4
cd= 2 4
Checking  1 5 ---- 2 5
cdc


 * @author vyasma1
 *
 */
public class PalindromLongest {


	public static void main(String args[]) {
		System.out.println(longestPalindrome("abcdca"));
	}
	
	public static String longestPalindrome(String s) {
		
	        int curLen = 0;
	        int start = -1;
	        
	        char[] array = s.toCharArray();
	        
	        for(int i = 0; i < array.length; i++) {
	        	int a = i - curLen - 1;
	        	int b = i - curLen ;
	        	System.out.println("Checking " +a+" "+i+"= "+showSub(s,a,i)+ " ---- "+b+" "+i+"= "+showSub(s,b,i));

	            if(isPalindrome(array, a, i)) {
		        	System.out.println(s.substring(a,i)+"= " +a+" "+i);
	                start = a;
	                curLen += 2;
	            } else if (isPalindrome(array,b, i)) {
		        	System.out.println(s.substring(b,i)+"= " +b+" "+i);
	                start = b;
	                curLen += 1;
	            }
	        }
	        return new String(array, start, curLen);
	    }
	
	    private static boolean isPalindrome(char[] array, int l, int r) {
	        if(l < 0) {return false;}

	        while(l < r) {
	        	char val1 = array[l++];
	        	char val2 = array[r--];
	        	
	            if(val1 !=val2) { return false;}
	        }
	        return true;
	    }
	    
	    
	    private static  String showSub(String str,int a,int i){
	    	if(a<0){return "";}
	    	return str.substring(a,i+1);
	    	
	    }
}

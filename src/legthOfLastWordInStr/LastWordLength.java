                                                                                                                                                                                                                package legthOfLastWordInStr;
/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Given s = "Hello World",

return 5 as length("World") = 5.

Please make sure you try to solve this problem without using library functions. Make sure you only traverse the string once
 *
 */
public class LastWordLength {
	public static void main(String args[]){
		int len = lastWordLen1("Somestrin");
		System.out.println(len);
	}
	
	public static int lastWordLen(String str){
		
		if(str.length() == 0) return 0;
		
		int n = str.length();
		int last = n;
		int first = n ;
		int i = n - 1; 
		while(i>=0 && str.charAt(i)== ' ') i--;
		
		last = i;
		
		for(;i>=0;i--){
			if(str.charAt(i)==' '){
				break;
			}
			first = i;
		}
		
		return Math.max(i, last - first + 1);
	}
	public static int lastWordLen1(String str){
		char[] arr= str.toCharArray();
		StringBuilder s = new StringBuilder();
		for(int i = str.length()-1;i>=0;i--){
			if(arr[i]== ' '){break;}
			s.append(arr[i]);
		}
		
		return s.length();
	
		
	}
}

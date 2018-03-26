package reverseStr2;

/**
Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.

The input string does not contain leading or trailing spaces and the words are always separated by a single space.

For example,
Given s = "the sky is blue",
return "blue is sky the".

Could you do it in-place without allocating extra space?

*/
public class ReverseStr2 {


	public static void main(String args[]){
		String s = "the sky is blue";
		System.out.println(reverseWords(s));
	}
	public static String reverseWords(String str){
		
		char[] s = str.toCharArray();
		strRev(s,0,str.length()-1);

		int spaceIndex = 0;
		for(int i=0; i<s.length; i++){
			if(s[i]==' ' || i==s.length-1){
				if(i==s.length-1){
					strRev(s,spaceIndex,i);
				}else{
					strRev(s,spaceIndex,i-1);
				}
				spaceIndex = i+1;
			}
		}
		
		
		
		return String.valueOf(s);
	}
	
	public static void strRev(char[] s,int l,int r){
		while(l<r){
			char temp = s[l];
			s[l] = s[r];
			s[r] = temp;
			l++;
			r--;
		}
		
	}
}

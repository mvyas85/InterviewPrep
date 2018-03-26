package reverseVowels;
/**
 * Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".


 * @author vyasma1
 *
 */
public class ReverseVowels {

	public static void main(String args[]){
		
	}
	public static String reverseVowels(String str){

		int l = 0;
		int r = str.length() - 1;
		while(l<r){
			while(l<r && !isVowel(str.charAt(l))){
				l++;
			}
			while(l<r && !isVowel(str.charAt(r))){
				r--;
			}
			str = swapChars(str,l,r);
			l++;
			r--;
		}
		return str;
		
	}
	
	private static String swapChars(String str, int l, int r) {
		char[] charArr = str.toCharArray();
		char temp = charArr[l];
		charArr[l] = charArr[r];
		charArr[r] = temp;
		return String.valueOf(charArr);
		
	}
	public static boolean isVowel(char ch){
		if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				ch == 'A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			return true;
		}
		return false;
	}
}

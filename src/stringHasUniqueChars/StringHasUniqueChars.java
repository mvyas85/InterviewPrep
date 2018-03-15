package stringHasUniqueChars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringHasUniqueChars {

	public static void main(String[] args) {
		String str = "manish";

		System.out.println(hasUniqueChars(str));
		System.out.println(hasUniqueCharsNoDS(str));

		System.out.println(checkUnique(str));
		//System.out.println(useArraysBinarySearch(str,"nisha"));
	}
	public static boolean hasUniqueChars(String str){

		Set<Character> myset = new HashSet<Character>();
		char[] chArr = str.toCharArray();
		for(char ch : chArr){
			if(!myset.add(ch)){
				return false;
			}
		}
		return true;
	}

	//Not using any additional data structure
	//This solution failes for - "manish∆∆"
	public static boolean hasUniqueCharsNoDS(String str){
		if (str.matches("((.)(?!.*\\1))*")) return true;
		return false;
	}

	//This solution failes for - "manish∆∆"
	public static boolean checkUnique(String str){

		boolean[] strSet = new boolean[256];//boolean array representing each character in char set

		for(int i = 0; i<str.length(); i++){
System.out.println(" i = "+i);
			int val = str.charAt(i);//we assign a character to an int so its ASCII value gets stored..!
			System.out.println(val + " "+str.charAt(i)+" "+ strSet[val]);
			if(strSet[val]){ //if its already true
				return false; //we have a duplicate
			}
			strSet[val] = true; //set boolean value representing that character to be true
		}
		return true; // all characters in string was unique..!
	}
	
	public static boolean useArraysBinarySearch(String[] arr, String targetValue) {	
		int a =  Arrays.binarySearch(arr, targetValue);
		if(a > 0)
			return true;
		else
			return false;
	}
}

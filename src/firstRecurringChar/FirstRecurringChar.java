package firstRecurringChar;

import java.util.HashSet;

public class FirstRecurringChar {
	
	public static void main(String args[]){
	
		String str = "ABCGHJKLEDGB";
		
		System.out.println(findRepeatingChar(str));
		
	}
	
	public static char findRepeatingChar(String str){
		HashSet<Character> set = new HashSet<>();
		
		for(int i = 0 ; i<str.length();i++){
			if(!set.add(str.charAt(i))){
				return str.charAt(i);
			}
		}
		
		return '\u0000';
	}
	

}

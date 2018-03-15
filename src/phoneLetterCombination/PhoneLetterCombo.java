package phoneLetterCombination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneLetterCombo {

	
	public static void main(String args[]){
		ArrayList<String> arr = letterCombinations("23");
		System.out.println(arr);
	}
	 public static ArrayList<String> letterCombinations(String digits) {
		 
	        ArrayList<String> result = new ArrayList<String>();
	        ArrayList<String> temp = new ArrayList<String>();
	        result.add("");

	        for(int i = 0; i < digits.length(); i++) {
	            String letters = map.get(digits.charAt(i));
	            if (letters.length() == 0)
	                continue;
	            for(String str : result) {
	                for(int j = 0; j < letters.length(); j++)
	                    temp.add(str + letters.charAt(j));
	            }
	            result = temp;
	            temp = new ArrayList<String>();
	        }      
	        return result;
	    }
	 
	     final static HashMap<Character,String> map = new HashMap<Character,String>(){{
	        put('1', "");
	        put('2',"abc");
	        put('3',"def");
	        put('4',"ghi");
	        put('5',"jkl");
	        put('6',"mno");
	        put('7',"pqrs");
	        put('8',"tuv");
	        put('9',"wxyz");
	        put('0', "");
	    }} ;
	
}

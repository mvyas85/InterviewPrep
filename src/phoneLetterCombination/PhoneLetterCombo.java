package phoneLetterCombination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * 
 * 

17. Letter Combinations of a Phone Number

https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.

Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
Note:
Although the above answer is in lexicographical order, your answer could be in any order you want.


 * @author vyasma1
 *
 */
public class PhoneLetterCombo {

	
	public static void main(String args[]){
		ArrayList<String> arr = letterCombinations("23");
		System.out.println(arr);
	}
	 public static ArrayList<String> letterCombinations(String digits) {
		 
	        ArrayList<String> result = new ArrayList<String>();
	        ArrayList<String> temp = new ArrayList<String>();
	        result.add("");

	        for(char ch : digits.toCharArray()) {
	            String letters = map.get(ch);
	            if (letters.length() == 0)
	                continue;
	            for(String str : result) {
	                for(char aletter : letters.toCharArray())
	                    temp.add(str + aletter);
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

package stringRotation;

import java.util.Scanner;


/*
 * Given a method isSubstring, two strings s1 and s2, 
 * check whether s1 is a rotation of s2 using only one call to isSubstring.
 * 
 * Example:
 * 
 * Welcome from manisha
 * elcome from manishaW
 * lcome from manishaWe
 * come from manishaWel

 */
public class StringRotation {

	public static void main(String[] args) {
	
		System.out.println(isRotation("Welcome from manisha","come from manishaWe"));
	}
//
//	private static boolean checkIfRotation(String s1, String s2) {
//		if(s1.length() != s2.length())
//			return false;
//		
//		if(s1.isSubstring(s1.concat(s2)))
//			return true;
//		return false;
//		
//	}

	static boolean isRotation(String s1,String s2) {
	    return (s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1);
	}
}

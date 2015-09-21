package anagrams;

import java.util.HashMap;
import java.util.Iterator;

public class AnagramStrings {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(isAnagram(s1, s2));

	}

	public static boolean isAnagram(String str1, String str2){
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for(int i=0;i<str1.length();i++){

			char ch =str1.charAt(i); 
			if(map1.containsKey(ch)){
				map1.put(ch,map1.get(ch)+1);
			}else{
				map1.put(ch,1);
			}
			
		}
		
		for(int i=0;i<str2.length();i++){

			char ch =str2.charAt(i); 
			if(map2.containsKey(ch)){
				map2.put(ch,map2.get(ch)+1);
			}else{
				map2.put(ch,1);
			}
			
		}
		return map1.equals(map2);
	//	return mapsAreEqual(map1,map2);
	}

	private static boolean mapsAreEqual(HashMap<Character, Integer> map1,
			HashMap<Character, Integer> map2) {
		for(char ch : map1.keySet()){
			
			if(!map2.containsKey(ch)){
				return false;
			}else{
				System.out.println("Checking :"+ch+" (map1.get(ch)="+(map1.get(ch))+" (map2.get(ch)="+(map2.get(ch)));
				if(map1.get(ch) != map2.get(ch))
					return false;
			}
		}
		return true;
	}
}

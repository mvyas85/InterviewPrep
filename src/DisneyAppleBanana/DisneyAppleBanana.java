package DisneyAppleBanana;

import java.util.HashSet;
import java.util.Iterator;

public class DisneyAppleBanana {
	public static void main (String args[]){
		String appleStr = "apple";//aple
		String bananaStr = "banana"; //ban
		
		HashSet<Character> hs1 =new HashSet<Character>();
		HashSet<Character> hs2 =new HashSet<Character>();
		
		char[] ca1 = appleStr.toCharArray();
		char[] ca2 = bananaStr.toCharArray();
		
		for (char c : ca1) {
			hs1.add(c);
		}
		for (char c : ca2) {
			hs2.add(c);
		}

		Iterator<Character> iter1 = hs1.iterator();
		
		while (iter1.hasNext()) {
			char current_c1,current_c2;
			current_c1 = (char ) iter1.next();
			Iterator<Character> iter2 = hs2.iterator();
			while (iter2.hasNext()) {
				current_c2 = (char) iter2.next();
				if(current_c1 == current_c2){
					System.out.println(current_c1);
				}
			}
			
		}
	
		
		
		
	}

}

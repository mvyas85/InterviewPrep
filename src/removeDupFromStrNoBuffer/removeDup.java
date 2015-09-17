package removeDupFromStrNoBuffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

/*string 
 * apple = aple
 */
public class removeDup {
	public static void main(String args[]){
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		sc.close();

		String str= "mini";
		//System.out.println(reverseStrRecursive(str));
		removeDuplicates(str);
		System.out.println("String :"+removeDuplicates(str));
	}
	public static String removeDuplicates(String str){
		if(str == null) return str;
		int len = str.length();
		if(len<2)return str;
		
		for(int i = 1;i< str.length();i++){
			int j;
			for( j = i-1;j>=0 ;j--){
				System.out.println("String is "+str + " index i ="+ i+ "index j ="+j);
				if(str.charAt(i) == str.charAt(j) ){
					str = MyUtils.removeElement(str, str.charAt(j) );
					break;
				}
			}
		}
		return str;
	}
}
class MyUtils{
	public static String removeElement(String str, char ch){
		
		char[] chs = str.toCharArray();
		List<Character> cList = new ArrayList<Character>();
		for(char c : chs) {
		    cList.add(c);
		}
		if (!cList.contains(ch)) return str;
		int index = cList.indexOf(ch);
		cList.remove(index);
		
		StringBuilder listString = new StringBuilder();

		for (char s : cList)
		{
		     listString.append(s);
		}

		//System.out.println(listString);
		return listString.toString();
		
	}
}
